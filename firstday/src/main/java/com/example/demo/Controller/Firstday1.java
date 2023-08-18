package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Firstday1 {
	@Value("${Name}")
	public String Name;
  @GetMapping("Name")
  public String getName()
  {
	return "welcome "+Name;
  }
}