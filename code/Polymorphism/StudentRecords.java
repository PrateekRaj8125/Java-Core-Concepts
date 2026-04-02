/* Write a Java program to store and display details of multiple students and find the student with the lowest CGPA.
The program should:

Accept:
    Number of students
    Roll number, name, and CGPA for each student
Store the data using arrays
Display all student details in tabular form
Identify and display the student with the lowest CGPA
 */
import java.util.Scanner;

public class StudentRecords {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter number of students: ");
            int n = sc.nextInt();

            int[] roll = new int[n];
            String[] name = new String[n];
            float[] cgpa = new float[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Enter Roll No. of student " + (i + 1) + ": ");
                roll[i] = sc.nextInt();
                sc.nextLine(); // consume newline

                System.out.print("Enter Name of student " + (i + 1) + ": ");
                name[i] = sc.nextLine();

                System.out.print("Enter CGPA of student " + (i + 1) + ": ");
                cgpa[i] = sc.nextFloat();
            }

            int index = 0;
            float min = cgpa[0];

            for (int i = 1; i < n; i++) {
                if (cgpa[i] < min) {
                    min = cgpa[i];
                    index = i;
                }
            }

            System.out.println("\nName\t\tRoll No.\tCGPA");
            for (int i = 0; i < n; i++) {
                System.out.println(name[i] + "\t" + roll[i] + "\t\t" + cgpa[i]);
            }

            System.out.println("\nLowest CGPA: " + min + " (Student: " + name[index] + ")");
        }
    }
}