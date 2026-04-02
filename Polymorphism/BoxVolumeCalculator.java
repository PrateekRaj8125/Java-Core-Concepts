/* Write a Java program to calculate the volume of a box using a class and object.
The program should:

Accept length, breadth, and height from the user
Use a class to represent a box
Calculate and display the volume of the box
*/
import java.util.*;

public class BoxVolumeCalculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Box b = new Box();
            System.out.print("Enter length: ");
            b.l = sc.nextDouble();
            System.out.print("Enter breadth: ");
            b.w = sc.nextDouble();
            System.out.print("Enter height: ");
            b.h = sc.nextDouble();
            System.out.println("The volume of the box is: " + b.volume());
        }
    }
}
class Box {
    double l, w, h;

    double volume() {
        return l * w * h;
    }
}