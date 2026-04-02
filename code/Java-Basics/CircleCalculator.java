/*Write a Java program to calculate the area and circumference of a circle.
The program should:

Accept the radius of the circle from the user
    Use a class named Circle with:
        A method to calculate the area
        A method to calculate the circumference
    Display both results to the user
 */
import java.util.Scanner;
public class CircleCalculator {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            Circle c = new Circle();
            System.out.print("Enter the radius of the circle: ");
            c.r = sc.nextInt();
            System.out.println("The area of the circle is: " + c.area());
            System.out.println("The circumference of the circle is: " + c.circumference());
        }
    }
}
class Circle {
    int r;
    public double area()
    {
        return 3.14*r*r;
    }
    public double circumference()
    {
        return 2*3.14*r;
    }
}