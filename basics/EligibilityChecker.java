import java.util.Scanner;

public class EligibilityChecker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter CGPA: ");
        double cgpa = scanner.nextDouble();

        System.out.println("\n----- Placement Result -----");

        // Decision logic (highest range first)
        if (cgpa >= 8.5) {
            System.out.println(name + " - Excellent (High priority candidate)");
        }
        else if (cgpa >= 7.0) {
            System.out.println(name + " is Eligible for placement.");
        }
        else {
            System.out.println(name + " is Not eligible for placement.");
        }

        scanner.close();
    }
}
