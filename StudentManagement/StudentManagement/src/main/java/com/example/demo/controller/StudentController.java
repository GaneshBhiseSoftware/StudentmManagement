package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Student;
import com.example.demo.Service.StudentService;

@RestController

public class StudentController {
	@Autowired
	StudentService ss;

	@PostMapping("/addStudent")
	public String addStudent(@RequestBody Student s) {
		ss.saveStudent(s);
		return "student added";
	}

	@DeleteMapping("deleteStudent/{sId}")
	public String deleteStudent(@PathVariable int sId) {
		ss.deleteStudent(sId);
		return "student is deleted";
	}
	@GetMapping("/get/{sId}")
	public Student getStud(@PathVariable int sId) {
		 
		 return ss.getStudent(sId);
	}
}
