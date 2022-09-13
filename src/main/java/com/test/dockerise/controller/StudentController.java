package com.test.dockerise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.dockerise.exception.UserNotFoundException;
import com.test.dockerise.service.StudentService;
import com.test.dockerise.student.Student;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService stuservice;
	
	@RequestMapping("/student")
	public List<Student> getAllDevices()
	{
		List<Student> ele =stuservice.getAllStudents();
		if(ele.size()<=0)
			throw new UserNotFoundException("Sorry student are not Present in the list");
		return ele;
	}
	
	@GetMapping("/student/{id}")
	public Student getStudent(@PathVariable Integer id)
	{
		Student stu=stuservice.getStudent(id);
		
		if(stu==null)
			
			throw new UserNotFoundException("Id is not present");
		return stu;
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/student")
	public void addStudent(@RequestBody Student stu)
	{
		stuservice.addStudent(stu);
	}

	
	@RequestMapping(method=RequestMethod.PUT,value="/student/{id}")
	public void UpdateStudent(@PathVariable Integer id ,@RequestBody Student stu)
	{
		stuservice.addStudent(stu);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/student/{id}")
	public void UpdateStudent(@PathVariable Integer id )
	{
		stuservice.deleteStudent(id);
	}
}
