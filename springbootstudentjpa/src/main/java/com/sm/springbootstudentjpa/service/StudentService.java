package com.sm.springbootstudentjpa.service;

import java.util.List;

import com.sm.springbootstudentjpa.student.Student;

public interface StudentService {
	
    public void saveStudent(Student student);
	
	public List<Student> getAllStudent();
	
	public Student getStudentById(Long studId);
	
	public List<Student> getStudentByName(String firstName, String lastName);
	
	public List<Student> getStudentsByFirstName(String firstName);
	
	public List<Student> getStudentsByFirstNameAndLastName(String firstName, String lastName);
	
	public List<Student> getStudentsByFirstNameOrLastName(String firstName, String lastName);
	
	public List<Student> getStudentsByFirstNameContainsOrLastNameContains(String firstName, String lastName);
	
	public List<Student> getStudentsByAddress(String address);
	
	public List<Student> getStudentsByAgeLessThan(int age);
	
	public List<Student> getStudentsByAgeLessThanEqual(int age);
	
	public List<Student> getStudentsByAgeGreaterThan(int age);
	
	public List<Student> getStudentsByAgeGreaterThanEqual(int age);

	
	

}
