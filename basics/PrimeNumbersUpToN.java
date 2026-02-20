import java.util.Scanner;

public class PrimeNumbersUpToN {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        System.out.println("Prime numbers up to " + n + ":");

        for (int num = 2; num <= n; num++) {

            boolean isPrime = true;

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num);
            }
        }

        scanner.close();
    }
}