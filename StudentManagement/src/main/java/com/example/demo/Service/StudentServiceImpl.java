package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired

	StudentRepository studentRepository;

	@Override
	public void deleteStudent(int sID) {

		studentRepository.deleteById(sID);

		System.out.println("delete");

	}

	@Override
	public Student getStudent(int sID) {

		return studentRepository.findById(sID).get();
	}

	@Override
	public void addStudent(Student student) {

		studentRepository.save(student);
		System.out.println("added");

	}

	@Override
	public List<Student> getAllStudent() {

		return studentRepository.findAll();
	}

}
