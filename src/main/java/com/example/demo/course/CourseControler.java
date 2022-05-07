package com.example.demo.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class CourseControler {
	
	@Autowired
	CourseService service;

	@GetMapping("/")
	public List<Course> getCourses(){
		return service.getCourses();
	}
	
	@GetMapping("/{id}")
	public Course getUser(@PathVariable int id){
		return service.getCouseById(id);
	}
}
