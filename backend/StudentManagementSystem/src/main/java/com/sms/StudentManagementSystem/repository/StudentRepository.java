package com.sms.StudentManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.StudentManagementSystem.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
