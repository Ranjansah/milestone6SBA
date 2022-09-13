package com.test.dockerise.student;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Milestone6")
public class Student {
	
	private int id;
	private int age;
	private String name;
	private String gender;
	
	public Student()
	{
		
	}

	public Student(int id, int age, String name, String gender) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.gender = gender;
	}

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	

}
