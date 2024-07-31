package com.puneeth.project ;
public class Patient {
	private int id;
	private String name;
	private int age;
	private String gender;
	private String time;
	private String date;

	public Patient(int id, String name, int age, String gender ,String time,String date) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.time = time;
		this.date = date;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ",time =" + time + ", date =" + date + "]";
	}

	// Constructor, getters, setters, and any other methods as needed
}