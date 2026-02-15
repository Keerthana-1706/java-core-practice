

import java.util.Scanner;

public class EvenNumberSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = scanner.nextInt();

        int sum = 0;

        System.out.println("Even numbers:");

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                sum = sum + i;
            }
        }

        System.out.println("Sum of even numbers: " + sum);

        scanner.close();
    }
}
