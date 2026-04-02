/* Write a Java program to demonstrate inheritance by storing and displaying details of persons and their bank accounts.
The program should:

    Create a base class Account with:
        Account number
        Balance
    Create a derived class Person that extends Account and includes:
        Name
        Aadhar number
    Accept details for multiple persons
    Display all entered information
*/
import java.util.Scanner;

class Account {
    int acc_no;
    double balance;

    public void input(Scanner sc) {
        System.out.print("Enter Account Number: ");
        acc_no = sc.nextInt();

        System.out.print("Enter Balance: ");
        balance = sc.nextDouble();
    }

    public void disp() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account {
    String name;
    String aadhar_no;

    public void input(Scanner sc) {
        sc.nextLine(); // consume newline
        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Aadhar Number: ");
        aadhar_no = sc.nextLine();

        super.input(sc);
    }

    public void disp() {
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadhar_no);
        super.disp();
    }
}

public class PersonAccountManager {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            Person[] persons = new Person[3];

            for (int i = 0; i < persons.length; i++) {
                persons[i] = new Person();
                System.out.println("\nEnter details for Person " + (i + 1) + ":");
                persons[i].input(sc);
            }

            System.out.println("\nDetails of all persons:");

            for (int i = 0; i < persons.length; i++) {
                System.out.println("\nPerson " + (i + 1) + ":");
                persons[i].disp();
            }
        }
    }
}