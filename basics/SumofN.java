// Add program to calculate sum of first N numbers using for loop 
// this : add in commit & remove this before pushing to git


import java.util.Scanner;

public class SumofN {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = scanner.nextInt();

        int sum = 0;  

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        System.out.println("The sum upto the number " + n + " is: " + sum);

        scanner.close();
    }
}
