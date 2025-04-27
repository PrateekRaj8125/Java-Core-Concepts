import java.util.*;
public class program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your roll no.: ");
        int roll = sc.nextInt();
        System.out.println("Enter your Section: ");
        String sec = sc.next();
        System.out.println("Enter your Branch: ");
        String branch = sc.next();
        System.out.println("Name:"+name);
        System.out.println("Roll no.:"+roll);
        System.out.println("Section:"+sec);
        System.out.println("Branch:"+branch);
        System.exit(0);
    }
}
