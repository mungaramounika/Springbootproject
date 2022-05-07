package com.example.demo.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.course.Course;
import com.example.demo.course.CourseService;

@RestController
@RequestMapping("/User")

public class UserControler {

	@Autowired
	UserService service;

	@GetMapping("/")
	public List<User> getUser() {
		return service.getUsers();
	}

	@GetMapping("/{email}")
 	public User getUser(@PathVariable String Emailid){
 		return service.getUserById(Emailid);
 	}
}