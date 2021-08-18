package com.sm.springbootstudentjpa.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.sm.springbootstudentjpa.exception.StudentNotFoundException;
import com.sm.springbootstudentjpa.repository.StudentRepository;
import com.sm.springbootstudentjpa.service.StudentService;
import com.sm.springbootstudentjpa.student.Student;

@Service
public class StudentServiceImpl implements StudentService  {
	
	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public void saveStudent(Student student) {
		studentRepository.save(student);
	}
	
	@Override
	public List<Student> getAllStudent()
	{
		return (List<Student>) studentRepository.findAll();
	}
	
	@Override
	public Student getStudentById(Long studentId) throws StudentNotFoundException{
		Optional<Student> student =studentRepository.findById(studentId);
//		return student.get();
		if(student.isPresent()) {
			return student.get();
		}else {
			throw new StudentNotFoundException("Student Not found");
		}
	}
    
	@Override
	public List<Student> getStudentByName(String firstName, String lastName) {
		List<Student> students =studentRepository.getStudentByName(firstName, lastName);
		return students;
	}
    
	@Override
	public List<Student> getStudentsByFirstName(String firstName) {
		
		List<Student> students = studentRepository.findByFirstName(firstName);
	
		return students;
	}
    
	@Override
	public List<Student> getStudentsByFirstNameAndLastName(String firstName, String lastName) {
		List<Student> students = studentRepository.findByFirstNameAndLastName(firstName, lastName);
		return students;
	}
	
	@Override
	public List<Student> getStudentsByFirstNameOrLastName(String firstName, String lastName) {
		List<Student> students = studentRepository.findByFirstNameOrLastName(firstName, lastName);
		return students;
	}
	
	@Override
	public List<Student> getStudentsByFirstNameContainsOrLastNameContains(String firstName, String lastName) {
		List<Student> students = studentRepository.findByFirstNameContainsOrLastNameContains(firstName, lastName);
		return students;
	}
	
	@Override
    public List<Student> getStudentsByAddress(String address) {
		
		List<Student> students = studentRepository.findByAddress(address);
	
		return students;
	}
    
	@Override
    public List<Student> getStudentsByAgeLessThan(int age) {
		
		List<Student> students = studentRepository.findByAgeLessThan(age);
	
		return students;
	}
    
	@Override
    public List<Student> getStudentsByAgeLessThanEqual(int age) {
		
		List<Student> students = studentRepository.findByAgeLessThanEqual(age);
	
		return students;
	}
    
	@Override
    public List<Student> getStudentsByAgeGreaterThan(int age) {
		
		List<Student> students = studentRepository.findByAgeGreaterThan(age);
	
		return students;
	}
    
	@Override
    public List<Student> getStudentsByAgeGreaterThanEqual(int age) {
		
		List<Student> students = studentRepository.findByAgeGreaterThanEqual(age);
	
		return students;
	}

}
