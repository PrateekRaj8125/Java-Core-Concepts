/*Write a Java program to reverse a person’s name.
The program should:

Accept the first name and last name from the user
Display the name in reverse order (last name followed by first name)
 */
import java.util.*;

public class NameReverser {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.print("Enter First Name: ");
            String fname = sc.nextLine();
            
            System.out.print("Enter Last Name: ");
            String lname = sc.nextLine();
            
            System.out.println("Reversed Name: " + lname + " " + fname);
        }
    }
}