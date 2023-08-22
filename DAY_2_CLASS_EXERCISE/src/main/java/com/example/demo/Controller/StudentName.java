package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentName {
	@Value("${stname}")
	private String stname;
	
@GetMapping("/displaydetails")
 public String getName()
 {
	return stname;
 }
}
