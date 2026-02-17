import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int originalNumber = number; // store original

        int reverse = 0;
        int count = 0;

        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
            count++; // count digits
        }

        System.out.println("Original number: " + originalNumber);
        System.out.println("Reversed number: " + reverse);
        System.out.println("Number of digits: " + count);

        scanner.close();
    }
}
