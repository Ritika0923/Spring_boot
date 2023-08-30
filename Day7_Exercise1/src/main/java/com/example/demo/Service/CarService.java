package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Car;
import com.example.demo.Repository.CarRepo;

@Service
public class CarService 
{
     @Autowired
     CarRepo sr;
     
     public Car saveinfo(Car ss)
     {
    	 return sr.save(ss);
     }
     
     public List<Car> showinfo()
     {
    	 return sr.findAll();
     }
     
     public List<Car> getOwners(int id)
 	 {
 		return sr.getinfoOwner(id);
 	 }
     
     public List<Car> getAddress(String addr)
  	 {
  		return sr.getinfoAddress(addr);
  	 }
     
     public List<Car> getCarname(String cname)
   	 {
   		return sr.getinfoCarname(cname);
   	 }
     
     public List<Car> getOwnerAndCartype(int id,String cname)
     {
    		return sr.getinfoOwnerandType(id,cname);
     }
     
     
}