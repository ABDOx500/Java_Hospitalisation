import models.Patient;
import services.PatientService;

public class Main {
    public static void main(String[] args) {
        // Initialize service
        PatientService patientService = new PatientService();

        // Create patients
        Patient patient1 = new Patient(1, "Alice", 30, "123 Main St");
        Patient patient2 = new Patient(2, "Bob", 40, "456 Elm St");

        // Add patients to service
        patientService.addPatient(patient1);
        patientService.addPatient(patient2);

        // Display all patients
        patientService.getAllPatients().forEach(patient ->
                System.out.println("ID: " + patient.getId() + ", Name: " + patient.getName())
        );
    }
}
