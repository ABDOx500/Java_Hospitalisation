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


}
