package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.service.ApiService;

@RestController
public class ApiController {
  
	@Autowired
	ApiService sser;
	@PostMapping("enter")
	 public Book enterdata(@RequestBody Book b) {
		return sser.postdata(b);
	}
	@GetMapping("see")
	public List<Book> show(){
		return sser.readdata();
	}
	@GetMapping("Getbyid/{id}")
	public Optional<Book> getid(@PathVariable int id){
		return sser.getid(id);
	}
	@DeleteMapping("deleteid/{id}")
	public String Delete(@PathVariable int id) {
		sser.deletedata(id);
		return "Id Deleted";
	}
	@PutMapping("updateid/{id}")
	public Book updateid(@PathVariable int id,@RequestBody Book b) {
		return sser.updateEmployeeById(id, b);
	}
}