package com.student.demo.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;

import com.student.demo.beans.StudentRegistration;

@Controller
public class StudentDeleteController {
	@RequestMapping(method = RequestMethod.DELETE , value="/delete/Student/{regNo}" )
	
	@ResponseBody
	public String deleteStudentRecord(@PathVariable("regNo")String regNo) {
		System.out.println("In deleteStudentRecord");
		return StudentRegistration.getInstance().deleteStudent(regNo);
	}
}