package com.students.names.service;

import java.util.ArrayList;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.students.names.dao.StudentDao;

@Component
public class StudentService {
		@Autowired
		private StudentDao studentDao;
		
		public ArrayList<String> getStudentNames(){
			return studentDao.getNames();
		}
		
		public ArrayList<String> sortNamesAlphabetically(){
			ArrayList<String> names = getStudentNames();
		 Collections.sort(names);
		 return names;
		}
		
		public ArrayList<String> sortNamesReverse(){
			ArrayList<String> names = getStudentNames();
			Collections.sort(names, Collections.reverseOrder());
			return names;
		}
		
		
		
}
