package com.greatLearning.Collegefest.service;

import java.util.List;
import com.greatLearning.Collegefest.entity.Student;

public interface StudentService {
	
	public List<Student> findAll();
	
	public void save(Student theStudent);
	
	public void deleteById(int theId);
	
	public List<Student> searchBy(String name, String Course);

	public Student findById(int theId);

}
