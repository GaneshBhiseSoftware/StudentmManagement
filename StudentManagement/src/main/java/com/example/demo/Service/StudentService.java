package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Student;

public interface StudentService {

	void addStudent(Student student);

	void deleteStudent(int sID);

	Student getStudent(int sID);

	List<Student> getAllStudent();

}
