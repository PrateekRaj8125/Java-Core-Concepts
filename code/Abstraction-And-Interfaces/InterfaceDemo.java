/* Write a Java program to demonstrate the use of an interface.
The program should:

Create an interface Motor with:
    A constant capacity
    Methods run() and consume()
Implement the interface in a class WashingMachine
Define all interface methods
Display the motor capacity and its operations
*/
interface Motor {
    int capacity = 100;

    void run();
    void consume();
}

class WashingMachine implements Motor {

    public void run() {
        System.out.println("Motor is running...");
    }

    public void consume() {
        System.out.println("Motor is consuming power...");
    }

    void display() {
        System.out.println("Capacity of Motor is " + capacity + " watts");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {

        WashingMachine wm = new WashingMachine();

        wm.run();
        wm.consume();
        wm.display();
    }
}