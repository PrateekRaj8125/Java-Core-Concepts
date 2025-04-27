import java.util.*;
public class AreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape shape = new Shape();
        
        System.out.println("Choose the shape to calculate area:");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Square");
        System.out.print("\nEnter your choice: ");
        int choice = sc.nextInt();
        
        switch (choice) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                double radius = sc.nextDouble();
                System.out.println("Area of the circle: " + shape.area(radius));
                break;
            
            case 2:
                System.out.print("Enter the base of the triangle: ");
                double base = sc.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = sc.nextDouble();
                System.out.println("Area of the triangle: " + shape.area(base, height));
                break;
            
            case 3:
                System.out.print("Enter the side of the square: ");
                int side = sc.nextInt();
                System.out.println("Area of the square: " + shape.area(side));
                break;
            
            default:
                System.out.println("Invalid choice! Please choose 1, 2, or 3.");
        }
        
        sc.close();
    }
}
