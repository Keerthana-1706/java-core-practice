
import java.util.Scanner;

public class NumberPrinter{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = scanner.nextInt();

        System.out.println("Numbers from 1 to " + n + ":");

        for(int i=1; i <= n; i++){
             System.out.println(i);

        }
        
    scanner.close();


    }
}