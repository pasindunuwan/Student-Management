package com.sms.StudentManagementSystem.reposiitory;

import com.sms.StudentManagementSystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepository  extends JpaRepository<Student,String> {
    @Query(value ="SELECT * FROM student WHERE index_no  =?1",nativeQuery = true)
    Student getStudentID(String  studentId);

}
