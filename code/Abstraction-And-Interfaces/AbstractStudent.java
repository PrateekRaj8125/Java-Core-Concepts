/* Write a Java program to demonstrate the use of an abstract class.
The program should:

Create an abstract class Student with:
    Roll number
    Registration number
    A method to accept input
Create a subclass Kiitian that:
    Adds course details
Accept and display all student information
*/
import java.util.*;

abstract class Student {
    int roll;
    long reg;

    void getInput(Scanner sc) {
        System.out.print("Enter Roll No.: ");
        roll = sc.nextInt();

        System.out.print("Enter Registration Number: ");
        reg = sc.nextLong();
    }
}

class Kiitian extends Student {
    String courseName;

    void getCourse(Scanner sc) {
        sc.nextLine(); // consume newline
        System.out.print("Enter Course Name: ");
        courseName = sc.nextLine();
    }
}

public class AbstractStudent {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            Kiitian kiit = new Kiitian();

            kiit.getInput(sc);
            kiit.getCourse(sc);

            System.out.println("\n--- Student Details ---");
            System.out.println("Roll No.: " + kiit.roll);
            System.out.println("Registration No.: " + kiit.reg);
            System.out.println("Course: " + kiit.courseName);
        }
    }
}