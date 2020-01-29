package com.student.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.student.demo.beans.Student;
import com.student.demo.beans.StudentRegistration;
import com.student.demo.beans.StudentRegistrationReply;

@Controller
public class StudentRegistrationController {
	
	@RequestMapping(method = RequestMethod.POST, value="/register/Student")
	
	@ResponseBody
	public StudentRegistrationReply registerStudent(@RequestBody Student student) {
		System.out.println("In registerStudent");
		StudentRegistrationReply stdregreply = new StudentRegistrationReply();
		stdregreply.setName(student.getName());
		stdregreply.setAge(student.getAge());
        stdregreply.setRegistrationNumber(student.getRegNo());
        StudentRegistration.getInstance().add(student);
        stdregreply.setRegistrationStatus("Successful");
        
        
        return stdregreply;
	}
}