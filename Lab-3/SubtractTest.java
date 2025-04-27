public class SubtractTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Subtract two integers (10 - 5): " + calc.subtract(10, 5));
        System.out.println("Subtract three integers (20 - 5 - 3): " + calc.subtract(20, 5, 3));
        System.out.println("Subtract two doubles (10.5 - 3.2): " + calc.subtract(10.5, 3.2));
        System.out.println("Subtract double and integer (15.5 - 4): " + calc.subtract(15.5, 4));
        
        int[] numbers = {50, 10, 5, 3};
        System.out.println("Subtract array of integers (50 - 10 - 5 - 3): " + calc.subtract(numbers));
    }
}
