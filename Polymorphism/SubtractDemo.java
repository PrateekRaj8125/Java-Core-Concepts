/* Write a Java program to demonstrate method overloading for subtraction operations.
The program should:

Create a class Calculator with multiple overloaded subtract() methods
Perform subtraction for:
    Two integers
    Three integers
    Two double values
    One double and one integer
    An array of integers
Display the results for each case
*/
public class SubtractDemo {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("Subtract two integers (10 - 5): " + calc.subtract(10, 5));
        System.out.println("Subtract three integers (20 - 5 - 3): " + calc.subtract(20, 5, 3));
        System.out.println("Subtract two doubles (10.5 - 3.2): " + calc.subtract(10.5, 3.2));
        System.out.println("Subtract double and integer (15.5 - 4): " + calc.subtract(15.5, 4));

        int[] numbers = {50, 10, 5, 3};
        System.out.println("Subtract array (50 - 10 - 5 - 3): " + calc.subtract(numbers));
    }
}

class Calculator {

    public int subtract(int a, int b) {
        return a - b;
    }

    public int subtract(int a, int b, int c) {
        return a - b - c;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double subtract(double a, int b) {
        return a - b;
    }

    public int subtract(int[] numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result -= numbers[i];
        }
        return result;
    }
}