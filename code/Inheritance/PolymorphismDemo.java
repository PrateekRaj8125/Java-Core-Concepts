/* Write a Java program to demonstrate runtime polymorphism using inheritance.
The program should:

Create a base class Apple with a method show()
Create derived classes Banana and Cherry that override the show() method
Use a base class reference to call overridden methods of different objects
Display appropriate messages for each object
*/
class Apple {
    public void show() {
        System.out.println("This is Apple class");
    }
}

class Banana extends Apple {
    public void show() {
        System.out.println("This is Banana class");
    }
}

class Cherry extends Apple {
    public void show() {
        System.out.println("This is Cherry class");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {

        Apple ref;

        ref = new Apple();
        ref.show();

        ref = new Banana();
        ref.show();

        ref = new Cherry();
        ref.show();
    }
}