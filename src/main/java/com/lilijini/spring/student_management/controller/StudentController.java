package com.lilijini.spring.student_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.google.protobuf.Method;
import com.lilijini.spring.student_management.entity.Student;
import com.lilijini.spring.student_management.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	StudentService studentService;

	@RequestMapping(value = "add-student", method = RequestMethod.POST)
	public ModelAndView addStudent(Student student) {
		return studentService.addStudent(student);
	}

	@RequestMapping(value = "display-all-students", method = RequestMethod.GET)
	public ModelAndView getAllStudents() {
		return studentService.getAllStudents();
	}

	@RequestMapping(value = "update-student")
	public ModelAndView updateStudentById(int studentId) {
		
		return studentService.updateStudentById(studentId);
	}

	@RequestMapping(value = "save-update-student", method = RequestMethod.POST)
	public ModelAndView updateStudent(Student student) {
		return studentService.updateStudent(student);
	}
	
	@RequestMapping(value = "delete-student",method = RequestMethod.GET)
	public ModelAndView deleteStudentById(int studentId) {
		return studentService.deleteStudentById(studentId);
	}
}
