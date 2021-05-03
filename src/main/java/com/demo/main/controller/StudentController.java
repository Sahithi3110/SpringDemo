package com.demo.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.main.model.Students;
import com.demo.main.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentservice;
	
	
    
	@GetMapping(path="/getStudents")
	public ResponseEntity<List<Students>> getAllStudents()
	{
		List<Students> list=studentservice.findAll();
		return new ResponseEntity<List<Students>>(list,HttpStatus.OK);
	}
	
	
			
}
