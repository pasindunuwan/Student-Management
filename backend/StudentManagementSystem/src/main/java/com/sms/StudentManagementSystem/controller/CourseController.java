package com.sms.StudentManagementSystem.controller;

import com.sms.StudentManagementSystem.dto.CourseDTO;

import com.sms.StudentManagementSystem.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController


@RequestMapping("api/v1/course")

public class CourseController {
    @Autowired
    private CourseService  courseService;

    @PostMapping("/saveCourse")
    public  CourseDTO saveCourse (@RequestBody CourseDTO courseDTO){
        return courseService.saveCourse( courseDTO);
    }

    @GetMapping("/getAllCourse")
    public List<CourseDTO> getAllCourse( ){
        return courseService.getAllCourse();
    }

    @PutMapping("/updateCourse")
    public CourseDTO updateCourse(@RequestBody CourseDTO courseDTO){
        return courseService.updateCourse(courseDTO);
    }

    @DeleteMapping("/deleteCourse")
    public  boolean deleteCourse(@RequestBody  CourseDTO courseDTO){
        return courseService.deleteCourse(courseDTO);
    }

    @GetMapping("/getCourseByStudentID/{studentID}")
    public CourseDTO getCourseByStudentID(@PathVariable String studentID){
        return  courseService.getCourseByStudentID(studentID);

    }
//    @DeleteMapping("/deleteCourseByStudentID/{indexno}"){
//        public CourseDTO deleteCourseByStudentID(@PathVariable String indexno){
//            return  courseService.deleteCourseByStudentID(indexno);
//
//        }

   // }

}