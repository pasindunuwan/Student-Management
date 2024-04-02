package com.sms.StudentManagementSystem.service;

import com.sms.StudentManagementSystem.dto.CourseDTO;
import com.sms.StudentManagementSystem.dto.StutendDTO;
import com.sms.StudentManagementSystem.entity.Course;
import com.sms.StudentManagementSystem.entity.Student;
import com.sms.StudentManagementSystem.reposiitory.CourseRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private ModelMapper modelMapper;
    public CourseDTO saveCourse(CourseDTO courseDTO){
        courseRepository.save(modelMapper.map(courseDTO, Course.class));
        return courseDTO;
    }
    public List<CourseDTO> getAllCourse(){
        List<Course>courseList=courseRepository.findAll();
        return modelMapper.map(courseList,new TypeToken<List<CourseDTO>>(){}.getType() );
    }

    public CourseDTO updateCourse(CourseDTO courseDTO){
        //use modelmapper

        courseRepository.save(modelMapper.map(courseDTO, Course.class));
        return courseDTO;

    }
    public  boolean deleteCourse(CourseDTO courseDTO ){
        courseRepository.delete(modelMapper.map(courseDTO, Course.class));
        return true;
    }
    public  CourseDTO getCourseByStudentID(String studentID){
        Course course=courseRepository.getStudentID(studentID);
        return modelMapper.map(course,CourseDTO.class);
    }
//    public  CourseDTO deleteCourseByStudentID(String indexno){
//        Course course=courseRepository.getStudentID( indexno);
//        return modelMapper.map(course,CourseDTO.class);
//    }
}


