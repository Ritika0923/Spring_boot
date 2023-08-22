package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Studententity;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
@Autowired
StudentService sser;
@PostMapping("addstudent")
public Studententity add(@RequestBody Studententity ss) {
	return sser.saveinfo(ss);
}
@PostMapping("addall")
public List<Studententity> add(@RequestBody List<Studententity> ss) {
	return sser.showlist(ss);
}

@GetMapping("showdetails")
public List<Studententity> show(){
	return sser.showinfo();
}

	
}
