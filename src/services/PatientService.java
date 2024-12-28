package services;

import models.Patient;
import java.util.ArrayList;
import java.util.List;

public class PatientService {
    private List<Patient> patients = new ArrayList<>();

    // Add patient
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    // Get all patients
    public List<Patient> getAllPatients() {
        return patients;
    }

    // Find patient by ID
    public Patient findPatientById(int id) {
        return patients.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }
}
