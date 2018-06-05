package com.example.demo.hazel.cache.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.hazel.cache.model.Student;
import com.example.demo.hazel.cache.service.StudentService;

@RestController
@RequestMapping("/cache")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/getAllStudents")
	public List<Student> getStudents() {
	  return studentService.getStudents();
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id") int id) {
		return studentService.delete(id);
	}
	

}
