/*Write a Java program to display student details.
The program should:

Accept the following details from the user:
    Name
    Roll number
    Section
    Branch
Display all the entered details in a formatted manner
 */
import java.util.*;
public class StudentDetails {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.print("Enter your name: ");
            String name = sc.nextLine();
            
            System.out.print("Enter your roll no.: ");
            int roll = sc.nextInt();
            
            System.out.print("Enter your Section: ");
            String sec = sc.next();
            
            System.out.print("Enter your Branch: ");
            String branch = sc.next();
            
            System.out.println("\n--- Student Details ---");
            System.out.println("Name: " + name);
            System.out.println("Roll No.: " + roll);
            System.out.println("Section: " + sec);
            System.out.println("Branch: " + branch);
        }
    }
}