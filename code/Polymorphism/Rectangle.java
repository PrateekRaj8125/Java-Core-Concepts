/* Write a Java program to calculate the area and perimeter of a rectangle using a class.
The program should:

Accept the length and breadth of the rectangle
Calculate:
Area
Perimeter
Display the results using separate methods
*/
import java.util.*;

public class Rectangle {
    double l, b, area, perimeter;

    void read(Scanner sc) {
        System.out.print("Enter length: ");
        l = sc.nextDouble();

        System.out.print("Enter breadth: ");
        b = sc.nextDouble();
    }

    void calculate() {
        area = l * b;
        perimeter = 2 * (l + b);
    }

    void display() {
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Rectangle rect = new Rectangle();
            rect.read(sc);
            rect.calculate();
            rect.display();
        }
    }
}