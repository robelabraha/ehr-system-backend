package com.ehr.patient;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/patients")
public class PatientController {

    private List<Patient> patients = new ArrayList<>();

    @GetMapping
    public List<Patient> getPatients() {
        return patients;
    }

    @GetMapping("/{id}")
    public Patient getPatientById(@PathVariable Long id) {
        return patients.stream()
                       .filter(p -> p.getId().equals(id))
                       .findFirst()
                       .orElseThrow(() -> new RuntimeException("Patient not found"));
    }

    @PostMapping
    public Patient createPatient(@RequestBody Patient patient) {
        patients.add(patient);
        return patient;
    }

    @DeleteMapping("/{id}")
    public String deletePatient(@PathVariable Long id) {
        patients.removeIf(p -> p.getId().equals(id));
        return "Deleted patient with id: " + id;
    }
}
