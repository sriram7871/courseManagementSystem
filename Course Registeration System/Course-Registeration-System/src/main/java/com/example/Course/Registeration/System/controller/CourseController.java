package com.example.Course.Registeration.System.controller;

import com.example.Course.Registeration.System.model.Course;
import com.example.Course.Registeration.System.model.CourseRegistry;
import com.example.Course.Registeration.System.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseService courseservice ;

    @GetMapping("courses")
    public List<Course> availableCourses(){
        return courseservice.availableCourses();
    }

    @GetMapping("courses/enrolled")
    public List<CourseRegistry> enrolledStudents(){
        return courseservice.enrolledStudents();
    }

    @PostMapping("/courses/register")
    public String enrollCourse(@RequestParam("name") String name ,
                               @RequestParam("emailId") String emailId,
                               @RequestParam("courseName") String courseName){
        courseservice.enrollCourse(name,emailId,courseName);
        return "Congratulations "+name+ " Enrollement Succesfull for "+courseName;
    }
}
