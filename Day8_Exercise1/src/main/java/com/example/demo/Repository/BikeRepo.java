package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.Model.Bike;

public interface BikeRepo extends JpaRepository<Bike, Integer>
{
	@Query(value = "select *from bike_table where year=:s",nativeQuery = true)
	public List<Bike> getinfoYear(@Param("s") int year);
	
	@Query(value = "select* from bike_table  where year=:d and bike_name=:e",nativeQuery = true)
	public List<Bike> getinfoYearAndBike(@Param("d") int year,@Param("e") String bike);

}