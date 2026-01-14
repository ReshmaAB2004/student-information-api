package com.example.studentinfo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity

public class Student {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 @NotBlank(message = "First name is required")
 @Size(min = 2, message = "First name must have at least 2 characters")
 private String firstName;

 @NotBlank(message = "Last name is required")
 private String lastName;

 @Email(message = "Email should be valid")
 private String email;

 private String course;

 private int age;

 public Long getId() {
	return id;
 }

 public void setId(Long id) {
	this.id = id;
 }

 public String getFirstName() {
	return firstName;
 }

 public void setFirstName(String firstName) {
	this.firstName = firstName;
 }

 public String getLastName() {
	return lastName;
 }

 public void setLastName(String lastName) {
	this.lastName = lastName;
 }

 public String getEmail() {
	return email;
 }

 public void setEmail(String email) {
	this.email = email;
 }

 public String getCourse() {
	return course;
 }

 public void setCourse(String course) {
	this.course = course;
 }

 public int getAge() {
	return age;
 }

 public void setAge(int age) {
	this.age = age;
 }
}
