/* Write a Java program to find the sum of two integers entered by the user.
The program should:

Accept two integer inputs from the user
Calculate their sum
Display the result
*/
import java.util.*;

public class SumCalculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.print("Enter the first number: ");
            int n1 = sc.nextInt();
            
            System.out.print("Enter the second number: ");
            int n2 = sc.nextInt();
            
            int sum = n1 + n2;
            
            System.out.println("The sum of the two numbers is: " + sum);
        }
    }
}