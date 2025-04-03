import java.util.*;

public class Rectangle {
    double l, b, area, perimeter;

    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        l = sc.nextDouble();
        System.out.print("Enter Breadth: ");
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
        Rectangle rect = new Rectangle();
        rect.read();
        rect.calculate();
        rect.display();
    }
}