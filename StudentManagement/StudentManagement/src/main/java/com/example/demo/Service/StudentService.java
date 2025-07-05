package com.example.demo.Service;

import com.example.demo.Entity.Student;

public interface StudentService {
 public void saveStudent( Student s);
 public void deleteStudent(int sId);
 public Student getStudent(int sId);
 
}
