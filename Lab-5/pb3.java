import java.util.*;
public class pb3{
public static void main(String[] args) {
    Manager mg=new Manager();
    mg.earnings();
    mg.deductions();
    mg.bonus();
    System.out.println("Earnings:"+mg.grosssalary);
    System.out.println("Deductions:"+mg.pf);
    System.out.println("Bonus:"+mg.bns);
}
}
interface Office{
    void earnings();
    void deductions();
    void bonus();
}
class Manager implements Office{
    double basic, hra, da, pf, bns, netsalary, grosssalary;
    public void earnings(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Basic Salary:");
        basic=sc.nextDouble();
        da=0.8*basic;
        hra=0.15*basic;
        grosssalary=basic+hra+da;
    }
    public void deductions(){
        pf=0.12*basic;
    }
    public void bonus(){
        bns=0.50*basic;
    }
}