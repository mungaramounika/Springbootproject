package com.example.demo.user;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.example.demo.course.Course;

@Service

public class UserService {

	private static final List<User> users = new ArrayList<>();

	@PostConstruct
	public void init() {		
		users.add(new User("Mounika", "Mungara", "mungaramounika09@gmail.com",9988776655L,"female","Hyderabad",500089,"Telangana","India","java"));
	}
		
	
	public List<User> getUsers(){
		return users;
	}
	
	public User getUserById(String email ) {
		Optional<User> optional = users.stream().filter(c -> c.getEmaiid().equalsIgnoreCase(email))
				.findFirst();
		return optional.isPresent() ? optional.get() : new User();
	}
	
	public User addUser(User User) {
		users.add(User);
		return getUserById(User.getEmaiid());
	}
}


