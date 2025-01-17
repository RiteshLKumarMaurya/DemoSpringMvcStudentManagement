package com.spring_mvc_project1.demo_controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controller1 extends HttpServlet {

	@RequestMapping("/demo")
	public ModelAndView test(int id, String name, HttpServletRequest req, HttpServletResponse res) {

		/// way 1 to redirect n the web page, to dont get the stuck 
		
//		try {
//			PrintWriter printer = res.getWriter();
//			printer.println("id: " + id + " name:=" + name);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		///2. using the ModelAndVie--> like the same as the RequestDispatcher--> always in the case of the controller will be having to use the ModelAndView class
		
		ModelAndView mav=new ModelAndView();
		mav.setViewName("output.jsp");
		
		mav.addObject("id",id);
		mav.addObject("name",name);
		
		return mav;
		

	}
//	
//		@RequestMapping("/demo")
//		public void test(int id, String name) {
//			System.out.println("id: "+id);
//			System.out.println("name: "+name);
//		}
//		
//		@RequestMapping("/demo")
//		public void test(int id) {
//			System.out.println("id: "+id);
//		}
//	
//		@RequestMapping("/demo")
//		public void test(String name) {
//			System.out.println("name: "+name);
//		}
}
