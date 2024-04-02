package com.sms.StudentManagementSystem.service.impl;

import com.sms.StudentManagementSystem.entity.Student;
import com.sms.StudentManagementSystem.repository.StudentRepository;
import com.sms.StudentManagementSystem.service.StudentService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@NoArgsConstructor
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

}
