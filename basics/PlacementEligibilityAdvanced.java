import java.util.Scanner;

public class PlacementEligibilityAdvanced {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter CGPA: ");
        double cgpa = scanner.nextDouble();

        System.out.print("Enter number of backlogs: ");
        int backlogs = scanner.nextInt();

        System.out.println("\n----- Placement Status -----");

        // if (cgpa >= 7) {
        //     if (backlogs == 0) {
        //         System.out.println(name + " is Eligible for placement.");
        //     } else {
        //         System.out.println(name + " must clear backlogs before placement.");
        //     }
        // } else {
        //     System.out.println(name + " is Not eligible for placement.");
        // }


        //or using AND
        if (cgpa >= 7 && backlogs == 0) {
            System.out.println(name + " is Eligible for placement.");
        }
        else if (cgpa >= 7 && backlogs > 0) {
            System.out.println(name + " must clear backlogs before placement.");
        }
        else {
            System.out.println(name + " is Not eligible for placement.");
        }

        scanner.close();
    }
}
