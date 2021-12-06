package com.sijan.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.sijan.model.Student;
import com.sijan.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	
	
	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

	
	//getting all the students

	@GetMapping({"/"})
	public String getAllStudents(Model model) {
		model.addAttribute("students", studentService.getAllStudent());
		return "index";
	}
	
//	@GetMapping("/students/{id}")
//	public String getStudent(@PathVariable Long id, Long sid, Model model) {
//		model.addAttribute("student", studentService.getSingleStudent(sid));
//		return "student";
//		}
	
	
	//handler for new students
	
	@GetMapping("/new")
	public String addStudentPage(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "add-students";
	}
	
	//adding new students 
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute Student student) {
		
		studentService.saveStudent(student);
		
	

		return "redirect:/";
	}
	
	//handler for update
	
	@GetMapping("/update/{id}")
	public String updateHandler(@PathVariable Long id, Model model) {
		Student student = studentService.getStudentById(id);
		model.addAttribute("updateStudent", student);
		
		return "update-page";
	}
	
	
	//update 
	
	
	
	
	
	@GetMapping("/delete/{id}")
	public String deleteStudent(@PathVariable Long id) {
		studentService.delete(id);
		return "redirect:/";
	}
	
	
	
	
	
	
	
	
	
	
	

}
