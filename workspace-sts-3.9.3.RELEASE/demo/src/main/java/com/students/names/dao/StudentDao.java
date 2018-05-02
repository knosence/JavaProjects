package com.students.names.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class StudentDao {
	private ArrayList<String>  studentNames ;
	
	public StudentDao() {
		studentNames= new ArrayList<String>();
	}

	@PostConstruct
	 public ArrayList<String> createNames(){
		  studentNames.add("Bryant");
		  studentNames.add("Donell");
		  studentNames.add("Bob");
		  studentNames.add("Dario");
		  return studentNames;
	 }
	 
	 public ArrayList<String> getNames(){
		 return studentNames;
	 }
	

}
