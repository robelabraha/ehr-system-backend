package com.ehr.patient;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PatientService {

    private final PatientRepository repository;

    public PatientService(PatientRepository repository) {
        this.repository = repository;
    }

    public List<Patient> getAllPatients() {
        return repository.findAll();
    }

    public Patient getPatientById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Patient not found"));
    }

    public Patient createPatient(Patient patient) {
        return repository.save(patient);
    }

    public void deletePatient(Long id) {
        repository.deleteById(id);
    }
}
