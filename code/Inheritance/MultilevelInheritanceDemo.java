/* Write a Java program to demonstrate multilevel inheritance using constructors.
The program should:

Create a base class Plate with length and width
Derive a class Box from Plate with an additional height
Derive another class WoodBox from Box with thickness
Use constructors to initialize values
Demonstrate constructor chaining using the super keyword
*/
import java.util.Scanner;

class Plate {
    int length, width;

    public Plate(int length, int width) {
        this.length = length;
        this.width = width;

        System.out.println("Plate constructor called:");
        System.out.println("Length: " + length + ", Width: " + width);
    }
}

class Box extends Plate {
    int height;

    public Box(int length, int width, int height) {
        super(length, width);

        this.height = height;

        System.out.println("Box constructor called:");
        System.out.println("Height: " + height);
    }
}

class WoodBox extends Box {
    int thick;

    public WoodBox(int length, int width, int height, int thick) {
        super(length, width, height);

        this.thick = thick;

        System.out.println("WoodBox constructor called:");
        System.out.println("Thickness: " + thick);
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter length: ");
            int length = sc.nextInt();

            System.out.print("Enter width: ");
            int width = sc.nextInt();

            System.out.print("Enter height: ");
            int height = sc.nextInt();

            System.out.print("Enter thickness: ");
            int thick = sc.nextInt();

            WoodBox woodBox = new WoodBox(length, width, height, thick);
        }
    }
}