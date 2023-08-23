package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepo;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ApiService {

	@Autowired
	BookRepo br;
	
	public Book postdata(Book b) {
		return br.save(b);
	}
	public List<Book> readdata(){
		return br.findAll();
		}
	public void deletedata(int i) {
		br.deleteById(i);
	}
	public Optional<Book> getid(int i){
		return br.findById(i);
	}
	public Book updateEmployeeById(	int id,Book E) {
        Optional<Book> optionalEmployee = br.findById(id);
        
        if(br.findById(id)!=null){
            Book existingEmployee = optionalEmployee.get();
            if(E.getBookName()!=null)
            	existingEmployee.setBookName(E.getBookName());
            if(E.getAuthorName()!=null)
            	existingEmployee.setAuthorName(E.getAuthorName());
            if(E.getQuantity()!=0)
            	existingEmployee.setQuantity(E.getQuantity());
            if(E.getPrice()!=0)
            	existingEmployee.setPrice(E.getPrice());
            return br.saveAndFlush(existingEmployee);
        } else {
            throw new EntityNotFoundException("Employee with ID " + id + " not found"); //updateById
        }
    }
	
}
