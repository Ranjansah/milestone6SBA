package com.test.dockerise.repository;

import org.springframework.data.repository.CrudRepository;

import com.test.dockerise.student.Student;

public interface StudentRepository extends CrudRepository<Student , Integer> {

}
