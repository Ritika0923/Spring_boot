package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Studententity;

public interface StudentRepo extends JpaRepository<Studententity,Integer>{

}