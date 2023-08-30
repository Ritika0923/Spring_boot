package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.Model.Car;

public interface CarRepo extends JpaRepository<Car, Integer> 
{
	@Query(value = "select *from car_table where owners=:s",nativeQuery = true)
	public List<Car> getinfoOwner(@Param("s") int id);
	
	@Query(value = "select* from car_table  where address=:a",nativeQuery = true)
	public List<Car> getinfoAddress(@Param("a") String addr);
	
	@Query(value = "select* from car_table  where car_name=:b",nativeQuery = true)
	public List<Car> getinfoCarname(@Param("b") String cname);
	
	@Query(value = "select* from car_table  where owners=:d and car_type=:e",nativeQuery = true)
	public List<Car> getinfoOwnerandType(@Param("d") int id,@Param("e") String ctype);

}