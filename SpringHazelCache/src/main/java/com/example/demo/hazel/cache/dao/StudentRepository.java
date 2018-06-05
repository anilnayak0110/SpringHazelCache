package com.example.demo.hazel.cache.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.hazel.cache.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
