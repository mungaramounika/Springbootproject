package com.example.demo.course;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	private static final List<Course> courses = new ArrayList<>();
	
	@PostConstruct
	public void init() {
		courses.add(new Course(101, "C & Data Structure", 500f, 30));
		courses.add(new Course(102, "Html", 300f, 30));
		courses.add(new Course(103, "Css", 300f, 30));
		courses.add(new Course(104, "Python", 500f, 30));
		courses.add(new Course(105, "Java", 500f, 30));
	}
	
	public List<Course> getCourses(){
		return courses;
	}
	
	public Course getCouseById(int id ) {
		Optional<Course> optional = courses.stream().filter(c -> c.getId() == id)
				.findFirst();
		return optional.isPresent() ? optional.get() : new Course();
	}
	
	public Course addCourse(Course course) {
		courses.add(course);
		return getCouseById(course.getId());
	}
}
