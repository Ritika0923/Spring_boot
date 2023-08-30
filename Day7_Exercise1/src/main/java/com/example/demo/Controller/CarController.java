package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Car;
import com.example.demo.Service.CarService;

@RestController
public class CarController 
{
	 @Autowired
     CarService sser;
     
     @PostMapping("adddetail")
     public Car add(@RequestBody Car ss)
     {
    	 return sser.saveinfo(ss);
     }
     
     @GetMapping("showdetails")
     public List<Car> show()
     {
    	 return sser.showinfo();
     }
     
    @GetMapping("owners/{id}")
 	public List<Car> displayOwner(@PathVariable int id)
 	{
 		return sser.getOwners(id);
 	}
    @GetMapping("/address/{addr}")
 	public List<Car> displayAddress(@PathVariable String addr)
 	{
 		return sser.getAddress(addr);
 	}
    @GetMapping("/carname/{cname}")
 	public List<Car> displayCarname(@PathVariable String cname)
 	{
 		return sser.getCarname(cname);
 	}
    @GetMapping("/owners/{id}/cartype/{ctype}")
 	public List<Car> displayOwnwerAndCtype(@PathVariable int id,@PathVariable String ctype)
 	{
 		return sser.getOwnerAndCartype(id, ctype);
 	}
    
}