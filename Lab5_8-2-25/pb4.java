import java.util.*;
public class pb4 {
    public static void main(String[] args) {
        Head hd=new Head();
        hd.getDetails();
        hd.getDeptDetails();
        System.out.println("\nEmployee ID:"+hd.Empid);
        System.out.println("Employee Name:"+hd.Ename);
        System.out.println("Department ID:"+hd.Deptid);
        System.out.println("Department Name:"+hd.Deptname);
    }
}
interface Employee{
    void getDetails();
}
interface Manager extends Employee{
    void getDeptDetails();
}
class Head implements Manager{
    int Empid;
    String Ename;
    int Deptid;
    String Deptname;
    public void getDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Employee ID:");
        Empid=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name:");
        Ename=sc.nextLine();
    }
    public void getDeptDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Department ID:");
        Deptid=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Department Name:");
        Deptname=sc.nextLine();
    }
}