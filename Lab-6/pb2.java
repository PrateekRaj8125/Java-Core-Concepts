import java.util.*;
public class pb2 {
 public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int a,b,c;
       System.out.print("Enter 1st number:");
       a=sc.nextInt();
       System.out.print("Enter 2nd number:");
       b=sc.nextInt();
       try {
           c=a/b;
           System.out.println("Quotient Found: "+c);
       } catch (ArithmeticException e) {
        System.out.println("Exception in thread \"main\"");
        System.out.println("java.lang.ArithmeticException: Division by zero is not allowed");
       } finally {
        System.out.println("Program continues after handling the exception");
       }
       c=a+b;
       System.out.println("Sum of "+a+" and "+b+": "+c);
    }
}
