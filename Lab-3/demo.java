import java.util.*;
public class demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        box b = new box();
        System.out.print("Enter Length:");
        b.l=sc.nextDouble();
        System.out.print("Enter breadth:");
        b.w=sc.nextDouble();
        System.out.print("Enter height:");
        b.h=sc.nextDouble();
        System.out.println("The volume of the box is: " + b.volume());
    }
}
