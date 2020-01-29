package com.student.demo.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.student.demo.beans.Student;
import com.student.demo.beans.StudentRegistration;

@Controller
public class StudentUpdateController {
	@RequestMapping(method = RequestMethod.PUT, value="/update/Student")
	
	@ResponseBody
	public String updateStudentRecord(@RequestBody Student stdn) {
		System.out.println("In updateStudentRecord");
		return StudentRegistration.getInstance().UpdateStudent(stdn);
	}
}
