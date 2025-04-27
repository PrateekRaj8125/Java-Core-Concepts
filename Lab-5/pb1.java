import java.util.*;
abstract class Student{
    int roll;
    long reg;
    void getinput(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Roll No.:");
        roll=sc.nextInt();
        System.out.print("Enter Registration Number:");
        reg=sc.nextLong();
    }
}
class Kiitian extends Student{
    String courseName;
    void course(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Course Name:");
        courseName = sc.nextLine();
    }
}
public class pb1{
    public static void main(String[] args) {
        Kiitian kiit=new Kiitian();
        kiit.getinput();
        kiit.course();
        System.out.println("Roll No.:"+kiit.roll);
        System.out.println("Registration No.:"+kiit.reg);
        System.out.println("Course:"+kiit.courseName);
    }
}