package com.lilijini.spring.student_management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.lilijini.spring.student_management.entity.Student;
import com.lilijini.spring.student_management.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository repository;

	public ModelAndView addStudent(Student student) {

		/// Perform the operaration first!-> saving the student instance in the database
		repository.addStudent(student);

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index.jsp");
		// After done work-> Response-> return back to the dashBOard
		return modelAndView;
	}

	public ModelAndView getAllStudents() {
		List<Student> students = repository.getAllStudent();

		ModelAndView mav = new ModelAndView();
		mav.addObject("students", students);
		mav.setViewName("displayAllStudents.jsp");
		return mav;
	}

	public ModelAndView updateStudent(Student student) {
		repository.updateStudent(student);

		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:display-all-students");
		return mav;

	}

	public ModelAndView updateStudentById(int studentId) {
		ModelAndView modelAndView = new ModelAndView();
		
		Student student=repository.getStudentById(studentId);
		
		modelAndView.addObject("student",student);
		modelAndView.setViewName("update_student.jsp");
		return modelAndView;
	}

	public ModelAndView deleteStudentById(int studentId) {
		
		repository.deleteStudentById(studentId);
		
		ModelAndView mav=new ModelAndView();
		mav.setViewName("redirect:display-all-students");
		
		return mav;
	}
	
	
	

}
