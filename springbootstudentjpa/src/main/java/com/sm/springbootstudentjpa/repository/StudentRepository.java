package com.sm.springbootstudentjpa.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sm.springbootstudentjpa.student.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
	
    List<Student> findByFirstName(String firstName);
	
	List<Student> findByFirstNameAndLastName(String firstName, String lastName);
	
	@Query("from Student where firstName=:firstName and lastName=:lastName")
	List<Student> getStudentByName(@Param("firstName") String firstName, @Param("lastName") String lastName);
	
	@Query(value = "select s from student s where s.first_name = :firstName and s.last_name = :lastName", nativeQuery = true)
	List<Student> getStudentsByNameSql(@Param("firstName") String firstName, @Param("lastName") String lastName);
	
	
	
	List<Student> findByFirstNameOrLastName(String firstName, String lastName);
	
	List<Student> findByFirstNameContainsOrLastNameContains(String firstName, String lastName);
	
	List<Student> findByAddress(String address);
	
	List<Student> findByAgeLessThan(int age);
	
	List<Student> findByAgeLessThanEqual(int age);
	
	List<Student> findByAgeGreaterThan(int age);
	
	List<Student> findByAgeGreaterThanEqual(int age);


}
