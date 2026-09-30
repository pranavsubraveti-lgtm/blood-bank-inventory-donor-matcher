public class BloodBank {

    public static void main(String[] args) {

        String patientGroup1   = "O+";
        int    requiredUnits1  = 2;
        int    availableUnits1 = 5;
        String donorGroup1     = "O+";

        System.out.println("Patient 1 ---");

        if (patientGroup1.equalsIgnoreCase(donorGroup1)) {
            if (availableUnits1 >= requiredUnits1) {
                System.out.println("Blood is available.");
                System.out.println("Blood can be issued to the patient.");
            } else {
                System.out.println("Blood group matches.");
                System.out.println("Not enough blood units available.");
                System.out.println("Donor is required.");
            }
        } else {
            System.out.println("Blood group does not match.");
        }

        String patientGroup2   = "O+";
        int    requiredUnits2  = 4;
        int    availableUnits2 = 2;
        String donorGroup2     = "O+";

        System.out.println("\n------------------------------ Patient 2 ------------------------------");

        if (patientGroup2.equalsIgnoreCase(donorGroup2)) {
            if (availableUnits2 >= requiredUnits2) {
                System.out.println("Blood is available.");
                System.out.println("Blood can be issued to the patient.");
            } else {
                System.out.println("Blood group matches.");
                System.out.println("Not enough blood units available.");
                System.out.println("Donor is required.");
            }
        } else {
            System.out.println("Blood group does not match.");
        }

        String patientGroup3   = "O+";
        int    requiredUnits3  = 2;
        int    availableUnits3 = 0;
        String donorGroup3     = "O-";

        System.out.println("\n------------------------------ Patient 3 ------------------------------");

        if (patientGroup3.equalsIgnoreCase(donorGroup3)) {
            if (availableUnits3 >= requiredUnits3) {
                System.out.println("Blood is available.");
                System.out.println("Blood can be issued to the patient.");
            } else {
                System.out.println("Blood group matches.");
                System.out.println("Not enough blood units available.");
                System.out.println("Donor is required.");
            }
        } else {
            System.out.println("Blood is not available in inventory.");

            if (donorGroup3.equalsIgnoreCase("O-")) {
                System.out.println("Donor is compatible.");
                System.out.println("Donor can donate blood.");
            } else {
                System.out.println("Donor not compatible.");
            }
        }

        System.out.println();
        System.out.println("PROCESS COMPLETED");
    }
}