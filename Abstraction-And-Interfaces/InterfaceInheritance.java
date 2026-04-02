/* Write a Java program to demonstrate interface inheritance.
The program should:

Create an interface Employee with a method getDetails()
Create another interface Manager that extends Employee
Implement both interfaces in a class Head
Accept and display employee and department details
*/
import java.util.*;

interface Employee {
    void getDetails(Scanner sc);
}

interface Manager extends Employee {
    void getDeptDetails(Scanner sc);
}

class Head implements Manager {
    int empId;
    String empName;
    int deptId;
    String deptName;

    public void getDetails(Scanner sc) {
        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        empName = sc.nextLine();
    }

    public void getDeptDetails(Scanner sc) {
        System.out.print("Enter Department ID: ");
        deptId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Department Name: ");
        deptName = sc.nextLine();
    }
}

public class InterfaceInheritance {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            Head hd = new Head();

            hd.getDetails(sc);
            hd.getDeptDetails(sc);

            System.out.println("\n--- Employee Details ---");
            System.out.println("Employee ID: " + hd.empId);
            System.out.println("Employee Name: " + hd.empName);
            System.out.println("Department ID: " + hd.deptId);
            System.out.println("Department Name: " + hd.deptName);
        }
    }
}