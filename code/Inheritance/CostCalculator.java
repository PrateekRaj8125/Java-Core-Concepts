/* Write a Java program to calculate the cost of a sheet and a box using inheritance.
The program should:

Display a menu for:
    Sheet (cost based on area)
    Box (cost based on volume)
Accept required dimensions:
    Sheet → length, breadth
    Box → length, breadth, height
Calculate and display the total cost using predefined rates
*/
import java.util.*;

class Dimensions {
    public int sheet(int length, int breadth) {
        return 40 * length * breadth;
    }

    public int box(int length, int breadth, int height) {
        return 60 * length * breadth * height;
    }
}

public class CostCalculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            Dimensions d = new Dimensions();

            System.out.println("Shapes\tRate:");
            System.out.println("1. Sheet\t₹40");
            System.out.println("2. Box\t₹60");

            System.out.print("Enter your choice: ");
            int n = sc.nextInt();

            switch (n) {
                case 1 -> {
                    System.out.print("Enter length: ");
                    int l = sc.nextInt();

                    System.out.print("Enter breadth: ");
                    int b = sc.nextInt();

                    System.out.println("Price of Sheet: " + d.sheet(l, b));
                }

                case 2 -> {
                    System.out.print("Enter length: ");
                    int l = sc.nextInt();

                    System.out.print("Enter breadth: ");
                    int b = sc.nextInt();

                    System.out.print("Enter height: ");
                    int h = sc.nextInt();

                    System.out.println("Price of Box: " + d.box(l, b, h));
                }

                default -> System.out.println("Wrong choice entered");
            }
        }
    }
}