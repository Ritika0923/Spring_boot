package com.example.medicalshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/medicines")
public class MedicineController {

    @Autowired
    private MedicineService medicineService;

    @GetMapping
    public List<Medicine> getMedicines() {
        return medicineService.getAllMedicines();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Medicine> getMedicine(@PathVariable int id) {
        Optional<Medicine> medicine = medicineService.getMedicineById(id);
        return medicine.map(value -> ResponseEntity.ok().body(value))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/addone")
    public ResponseEntity<Medicine> createMedicine(@RequestBody Medicine medicine) {
        Medicine savedMedicine = medicineService.createMedicine(medicine);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedMedicine);
       
    }

    @PostMapping("/addall")
    public ResponseEntity<List<Medicine>> addMedicinesList(@RequestBody List<Medicine> medicines) {
        List<Medicine> addedMedicines = medicineService.addMedicines(medicines);
        return ResponseEntity.status(HttpStatus.CREATED).body(addedMedicines);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Medicine> updateMedicine(@PathVariable int id, @RequestBody Medicine updatedMedicine) {
        Optional<Medicine> updated = medicineService.updateMedicine(id, updatedMedicine);
        return updated.map(value -> ResponseEntity.ok().body(value))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMedicine(@PathVariable int id) {
        boolean deleted = medicineService.deleteMedicine(id);
        return deleted ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}
