
import java.util.Scanner;
public class MyMain {
    public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
        Circle c = new Circle();
        System.out.print("Enter the radius of the circle: ");
        c.r = sc.nextInt();
        System.out.println("The area of the circle is: " + c.area());
        System.out.println("The circumference of the circle is: " + c.circumference());
    }
}