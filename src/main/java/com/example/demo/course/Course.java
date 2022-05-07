package com.example.demo.course;

public class Course {
	private int id;
	private String name;
	private float fee;
	private int duration;
	
	public Course() {
		
	}
	
	public Course(int id, String name, float fee, int duration) {
		super();
		this.id = id;
		this.name = name;
		this.fee = fee;
		this.duration = duration;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getFee() {
		return fee;
	}
	public void setFee(float fee) {
		this.fee = fee;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	
	

}
