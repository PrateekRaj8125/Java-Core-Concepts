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
public class Multi_Inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
