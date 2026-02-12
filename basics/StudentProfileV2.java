public class StudentProfileV2 {

    public static void main(String[] args) {

        // Constant (value should not change)
        final String COMPANY_NAME = "ABC Technologies";

        // Original salary (double)
        double salary = 45678.90;

        // Explicit casting: double → int
        int roundedSalary = (int) salary;

        // Implicit casting: int → double
        int experienceYears = 5;
        double experienceAsDouble = experienceYears;

        // Output
        System.out.println("--------- Employee Salary Details ---------");
        System.out.println("Company            : " + COMPANY_NAME);
        System.out.println("Original Salary    : " + salary);
        System.out.println("Rounded Salary     : " + roundedSalary);
        System.out.println("Experience (years) : " + experienceYears);
        System.out.println("Experience (double): " + experienceAsDouble);
    }
}
