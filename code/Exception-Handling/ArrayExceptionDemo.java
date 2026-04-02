/* Write a Java program to demonstrate exception handling using ArrayIndexOutOfBoundsException.
The program should:

Accept 4 integers into an array
Attempt to access an invalid index
Handle the exception using try-catch
Display an appropriate error message
*/
import java.util.*;

public class ArrayExceptionDemo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int n = 4;
            int[] arr = new int[n];

            System.out.print("Enter 4 numbers: ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            try {
                System.out.println("Element at index " + n + ": " + arr[n]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception caught: " + e);
            }
        }
    }
}