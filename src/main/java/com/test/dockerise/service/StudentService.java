package com.test.dockerise.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dockerise.repository.StudentRepository;
import com.test.dockerise.student.Student;


@Service
public class StudentService {
	
	@Autowired
	public StudentRepository stuRepo;
	
	public List<Student> getAllStudents()
	{
		List<Student> stus=new ArrayList<>();
		stuRepo.findAll().forEach(stus::add);
		return  stus;
	}
	
	public Student getStudent(Integer id)
	{
		try
		{
			return stuRepo.findById(id).get();
		}
		catch(Exception e)
		{
			return null;
		}
	}
	public void addStudent(Student stu)
	{
		stuRepo.save(stu);
	}
	
	public void updateStudent(Integer id, Student stu)
	{
		stuRepo.save(stu);
	}
	
	public void deleteStudent(Integer id)
	{
		stuRepo.deleteById(id);
	}

	

}
