/*Write a Java program to check whether a given number is a palindrome or not.
The program should:

Accept a positive integer from the user
Reverse the number
Compare the reversed number with the original number
Display whether the number is a palindrome
 */
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.print("Enter a positive integer: ");
            int num = sc.nextInt();
            
            int dn = num, rev = 0;
            
            while (dn > 0) {
                int rem = dn % 10;
                rev = rev * 10 + rem;
                dn = dn / 10;
            }
            
            if (rev == num)
                System.out.println("The number is a palindrome.");
            else
                System.out.println("The number is not a palindrome.");
        }
    }
}