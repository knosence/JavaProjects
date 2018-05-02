package com.students.names.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.students.names.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	@RequestMapping("/students")
	public ArrayList<String> getStudentNames() {
		return studentService.getStudentNames();
	}
	
	@GetMapping("/sorted")
	public ArrayList<String> sortedStudentNames(){
		return studentService.sortNamesAlphabetically();
	}
	
	@GetMapping("/reverse")
	public ArrayList<String> reverseStudentNames(){
		return studentService.sortNamesReverse();
	}

}
