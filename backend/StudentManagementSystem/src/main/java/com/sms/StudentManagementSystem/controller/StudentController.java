package com.sms.StudentManagementSystem.controller;

import com.sms.StudentManagementSystem.service.StudentService;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@NoArgsConstructor
@AllArgsConstructor
public class StudentController  {
    private StudentService studentService;
@GetMapping("/student")
    public String listStudent(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "students";
    }

}
