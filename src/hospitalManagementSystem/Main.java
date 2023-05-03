package hospitalManagementSystem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Patient p1 = new Patient("shubham", 24, "Pandur");
        ArrayList<Patient> patient = new ArrayList<>();
        patient.add(p1);
        System.out.println(patient);
    }
}