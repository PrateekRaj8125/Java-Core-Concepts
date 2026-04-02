/* Write a Java program to demonstrate user-defined (custom) exception handling.
The program should:

Create a custom exception class for handling negative numbers
Accept an integer input from the user
Throw an exception if the number is negative
Otherwise, display double the value of the number
Handle the exception using try-catch
*/
import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {

    public static void processInput(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Number should be positive");
        } else {
            System.out.println("Double value: " + (number * 2));
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            try {
                processInput(number);
            } catch (NegativeNumberException e) {
                System.out.println("Caught the exception");
                System.out.println("Exception occurred: " + e.getMessage());
            }
        }
    }
}