package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Student;
import com.example.demo.Service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService ss;

	@PostMapping("add")
	public String saveStudent(@RequestBody Student type) {

		ss.addStudent(type);

		return "addes student";

	}

	@DeleteMapping("delete/{sID}")
	public String deleteStudent(@PathVariable int sID) {

		ss.deleteStudent(sID);

		return "Delete nStudent ";

	}

	@GetMapping("get/{sID}")
	public Student getStudent(@PathVariable int sID) {

		return ss.getStudent(sID);
	}

	@GetMapping("get")
	public List<Student> getall(@RequestBody Student aa) {
		return ss.getAllStudent();
	}
}
