package com.in28minutes.learnspringboot.courses.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.learnspringboot.courses.bean.Course;

@RestController
public class CourseController {

	// http://localhost:8080/courses
	@GetMapping("/courses")
	public List<Course> getAllCourses() {
		return Arrays.asList(new Course(1, "Learn Microservices", "in28Minutes"),
				new Course(2, "Learn Full Stack with Angular and React", "in28minutes"));
	}

	@GetMapping("courses/1")
	public Object getOneCourse() {
		return (new Course(3, "REACT", "Warren"));
	}
}
