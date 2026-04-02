/* Write a Java program to demonstrate exception handling using try-catch-finally.
The program should:

Accept two integers from the user
Perform division and handle division by zero using ArithmeticException
Use a finally block to display a message
Continue execution and display the sum of the two numbers
*/
import java.util.*;

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int a, b, c;

            System.out.print("Enter 1st number: ");
            a = sc.nextInt();

            System.out.print("Enter 2nd number: ");
            b = sc.nextInt();

            try {
                c = a / b;
                System.out.println("Quotient Found: " + c);
            } catch (ArithmeticException e) {
                System.out.println("Exception caught: Division by zero is not allowed");
            } finally {
                System.out.println("Program continues after handling the exception");
            }

            c = a + b;
            System.out.println("Sum of " + a + " and " + b + ": " + c);
        }
    }
}