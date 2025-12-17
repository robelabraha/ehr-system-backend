package com.ehr.ehrsystembackend;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/patients")
public class PatientController {

    @GetMapping
    public List<String> getPatients() {
        return List.of("Alice Smith", "John Doe");
    }

    @GetMapping("/{id}")
    public String getPatientById(@PathVariable int id) {
        return "Patient #" + id;
    }

    @PostMapping
    public String createPatient(@RequestBody String name) {
        return "Created patient: " + name;
    }
}
