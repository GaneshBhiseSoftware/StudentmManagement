package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="Stud")
public class Student {
	
@Id
  private int sId;
  private String name;
  private String address;
  private String email;
  private int age;
public int getsId() {
	return sId;
}
public void setsId(int sId) {
	this.sId = sId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
   }
}
