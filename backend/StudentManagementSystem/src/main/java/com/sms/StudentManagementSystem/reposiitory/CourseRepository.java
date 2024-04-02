
package com.sms.StudentManagementSystem.reposiitory;
import com.sms.StudentManagementSystem.entity.Course;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CourseRepository extends JpaRepository<Course,String> {
    @Query(value ="SELECT * FROM course WHERE index_no  =?1",nativeQuery = true)
    Course getStudentID(String  studentID);
}
