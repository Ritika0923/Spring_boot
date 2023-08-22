package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Studententity;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentService {

	@Autowired
	StudentRepo sr;
	
	public Studententity saveinfo(Studententity ss) {
		return sr.save(ss);
	}
	
	public List<Studententity> showinfo(){
		return sr.findAll();
	}
	public List<Studententity>showlist(List<Studententity> ss){
		return sr.saveAll(ss);
	}
	
	public Studententity changeinfo(Studententity ss) {
		return sr.saveAndFlush(ss);
	}
	
	public void deleteinfo(Studententity ss) {
		sr.delete(ss);
	}
	
}
