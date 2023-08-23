package com.example.medicalshop;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicineRepository extends JpaRepository<Medicine, Integer> {

	
}
