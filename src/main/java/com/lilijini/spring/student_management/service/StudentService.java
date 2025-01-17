package com.lilijini.spring.student_management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.lilijini.spring.student_management.entity.Student;
import com.lilijini.spring.student_management.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository  repository;
	public ModelAndView addStudent(Student student) {
		
		///Perform the operaration first!-> saving the student instance in the database
		repository.addStudent(student);

		
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("index.jsp");
		//After done work-> Response-> return back to the dashBOard
		return modelAndView;
	}
	
}
