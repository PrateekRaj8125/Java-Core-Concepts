/*Write a Java program to display the name of a weekday based on its number.
The program should:

Accept a number (1–7) from the user
Display the corresponding day of the week using a switch statement
Show an error message for invalid input
 */
import java.util.*;

public class WeekdayFinder {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.print("Enter the weekday number (1-7): ");
            int day = sc.nextInt();
            
            switch (day) {
                case 1 -> System.out.println("Monday");
                case 2 -> System.out.println("Tuesday");
                case 3 -> System.out.println("Wednesday");
                case 4 -> System.out.println("Thursday");
                case 5 -> System.out.println("Friday");
                case 6 -> System.out.println("Saturday");
                case 7 -> System.out.println("Sunday");
                default -> System.out.println("Invalid day");
            }
        }
    }
}