/* Write a Java program to calculate the net salary of an employee using an interface.
The program should:

Define an interface Office with methods:
    earnings()
    deductions()
    bonus()
Implement the interface in a class Manager
Accept the basic salary from the user
Calculate:
    HRA and DA (earnings)
    PF (deductions)
    Bonus
Compute and display the net salary
*/
import java.util.*;

interface Office {
    void earnings(Scanner sc);
    void deductions();
    void bonus();
}

class Manager implements Office {
    double basic, hra, da, pf, bns, netsalary, grosssalary;

    public void earnings(Scanner sc) {
        System.out.print("Enter Basic Salary: ");
        basic = sc.nextDouble();

        da = 0.8 * basic;
        hra = 0.15 * basic;
        grosssalary = basic + hra + da;
    }

    public void deductions() {
        pf = 0.12 * basic;
    }

    public void bonus() {
        bns = 0.50 * basic;
    }
}

public class SalaryCalculatorInterface {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            Manager mg = new Manager();

            mg.earnings(sc);
            mg.deductions();
            mg.bonus();

            mg.netsalary = mg.grosssalary - mg.pf + mg.bns;

            System.out.println("\n--- Salary Details ---");
            System.out.println("Earnings: " + mg.grosssalary);
            System.out.println("Deductions: " + mg.pf);
            System.out.println("Bonus: " + mg.bns);
            System.out.println("Net Salary: " + mg.netsalary);
        }
    }
}