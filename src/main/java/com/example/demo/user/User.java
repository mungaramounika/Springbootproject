package com.example.demo.user;

import java.math.BigInteger;

public class User {
	private String FirstName;
	private String LastName;
	private String Emaiid;
	private long MobileNumber;
	private String Gender;
	private String City;
	private int Pincode;
	private String State;
	private String Country;
	private String Courses;

	public User() {

	}
	
	

	public User(String firstName, String lastName, String emaiid, long mobileNumber, String gender, String city,
			int pincode, String state, String country, String courses) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Emaiid = emaiid;
		MobileNumber = mobileNumber;
		Gender = gender;
		City = city;
		Pincode = pincode;
		State = state;
		Country = country;
		Courses = courses;
	}



	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmaiid() {
		return Emaiid;
	}

	public void setEmaiid(String emaiid) {
		Emaiid = emaiid;
	}

	public long getMobileNumber() {
		return MobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		MobileNumber = mobileNumber;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public int getPincode() {
		return Pincode;
	}

	public void setPincode(int pincode) {
		Pincode = pincode;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getCourses() {
		return Courses;
	}

	public void setCourses(String courses) {
		Courses = courses;
	}

	
}
