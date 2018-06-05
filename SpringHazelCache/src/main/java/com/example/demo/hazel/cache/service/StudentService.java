package com.example.demo.hazel.cache.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.demo.hazel.cache.dao.StudentRepository;
import com.example.demo.hazel.cache.model.Student;


@Service
public class StudentService {

	@Autowired
	private StudentRepository repository;
	
	@Cacheable(cacheNames= {"CacheConfig"})
	public List<Student> getStudents() {
		System.out.println("Hit db first time to get all student details !!!!!!!!!!!!!!!!");
		return repository.findAll();
		
	}
	
	@CacheEvict(value="CacheConfig")
	public String delete(int id) {
		repository.deleteById(id);
		return "Student deleted with id:::"+id;
	}
}
