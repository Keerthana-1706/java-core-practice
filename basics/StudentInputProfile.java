import java.util.Scanner;

public class StudentInputProfile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter age: ");
        int studentAge = scanner.nextInt();

        System.out.print("Enter CGPA: ");
        double studentCgpa = scanner.nextDouble();

        
        System.out.println("\n----- Student Details -----");
        System.out.println("Name : " + studentName);
        System.out.println("Age  : " + studentAge);
        System.out.println("CGPA : " + studentCgpa);

        scanner.close();
    }
}
