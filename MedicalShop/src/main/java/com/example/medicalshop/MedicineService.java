package com.example.medicalshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicineService {

    @Autowired
    private MedicineRepository medicineRepository;
    public List<Medicine> addMedicines(List<Medicine> medicines) {
        return medicineRepository.saveAll(medicines);
    }

    public List<Medicine> getAllMedicines() {
        return medicineRepository.findAll();
    }

    public Optional<Medicine> getMedicineById(int id) {
        return medicineRepository.findById(id);
    }

    public Medicine createMedicine(Medicine medicine) {
        return medicineRepository.save(medicine);
    }
    

    public Optional<Medicine> updateMedicine(int id, Medicine updatedMedicine) {
        Optional<Medicine> existingMedicine = medicineRepository.findById(id);
        if (existingMedicine.isPresent()) {
            Medicine medicine = existingMedicine.get();
            medicine.setName(updatedMedicine.getName());
            medicine.setPrice(updatedMedicine.getPrice());
            return Optional.of(medicineRepository.save(medicine));
        } else {
            return Optional.empty();
        }
    }

    public boolean deleteMedicine(int id) {
        Optional<Medicine> medicine = medicineRepository.findById(id);
        if (medicine.isPresent()) {
            medicineRepository.delete(medicine.get());
            return true;
        } else {
            return false;
        }
    }
}
