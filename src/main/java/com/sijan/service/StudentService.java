package com.sijan.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sijan.model.Student;
import com.sijan.repository.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepo studentRepo;
	
	
	
	public StudentService(StudentRepo studentRepo) {
		super();
		this.studentRepo = studentRepo;
	}



	public List<Student> getAllStudent(){
		return studentRepo.findAll();
		
	}
	
	public void saveStudent(Student student) {
		studentRepo.save(student);
	}
	
	public Student getStudentById(Long id) {
		Optional<Student> optional = studentRepo.findById(id);
		Student student = null;
		if(optional.isPresent()) {
			student = optional.get();
		}
		else {
			throw new RuntimeException("Student not found for id:: "+id);
		}
		
		
		
		return studentRepo.save(student);
	}
	
	
	
	
	
	public void  delete(Long id) {
		studentRepo.deleteById(id);
	}
	
	


}
