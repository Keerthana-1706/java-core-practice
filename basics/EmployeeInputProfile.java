import java.util.Scanner;

public class EmployeeInputProfile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter emp id: ");
        int emp_id = scanner.nextInt();

        // IMPORTANT: consume the leftover newline
        scanner.nextLine();

     
        System.out.print("Enter emp name: ");
        String emp_name = scanner.nextLine();

        
        System.out.print("Enter emp salary: ");
        double emp_salary = scanner.nextDouble();

       
        System.out.println("\n----------- Employee Details -----------");
        System.out.println("ID     : " + emp_id);
        System.out.println("Name   : " + emp_name);
        System.out.println("Salary : " + emp_salary);

        scanner.close();
    }
}
