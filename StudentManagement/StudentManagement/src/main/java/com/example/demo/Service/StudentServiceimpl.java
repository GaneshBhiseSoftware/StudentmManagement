package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;
import com.example.demo.Repo.StudentRepo;


@Service
public class StudentServiceimpl implements StudentService {
	@Autowired
	StudentRepo sr;

	@Override
	public void saveStudent(Student s) {
		sr.save(s);

	}

	@Override
	public void deleteStudent(int sId) {
		sr.deleteById(sId);

	}

	@Override
	public Student getStudent(int sId) {
	
		return 	sr.getById(sId);
	}
}
