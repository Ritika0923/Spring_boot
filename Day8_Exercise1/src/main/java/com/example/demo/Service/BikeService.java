package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Bike;
import com.example.demo.Repository.BikeRepo;

@Service
public class BikeService
{
	@Autowired
    BikeRepo sr;
    
    public Bike saveinfo(Bike ss)
    {
   	 return sr.save(ss);
    }
    
    public List<Bike> showinfo()
    {
   	 return sr.findAll();
    }
    
    public List<Bike> getYear(int id)
	 {
		return sr.getinfoYear(id);
	 }
    
    public List<Bike> getYearAndBike(int id,String bike)
    {
   		return sr.getinfoYearAndBike(id,bike);
    }
}