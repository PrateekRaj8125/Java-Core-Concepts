/*Write a Java program to determine the grade of a student based on marks.
The program should:

Accept the student's marks as input
Assign grades based on the following criteria:
Marks Range	    Grade
90 and above	O
80 – 89	        E
70 – 79	        A
60 – 69	        B
50 – 59	        C
40 – 49	        D
Below 40	    F
Display the corresponding grade
*/

import java.util.*;

public class GradeCalculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your marks: ");
            int marks = sc.nextInt();
            if (marks >= 90) {
                System.out.println("Grade: O");
            } else if (marks >= 80) {
                System.out.println("Grade: E");
            } else if (marks >= 70) {
                System.out.println("Grade: A");
            } else if (marks >= 60) {
                System.out.println("Grade: B");
            } else if (marks >= 50) {
                System.out.println("Grade: C");
            } else if (marks >= 40) {
                System.out.println("Grade: D");
            } else {
                System.out.println("Grade: F");
            }
        }
    }
}