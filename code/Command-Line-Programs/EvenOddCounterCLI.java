/*Write a Java program to count even and odd numbers using command-line arguments.
The program should:

Accept 10 integers as command-line arguments
Determine whether each number is even or odd
Count and display the total number of even and odd values
 */
public class EvenOddCounterCLI {
    public static void main(String[] args) {
        
        if (args.length == 0) {
            System.out.println("Please provide numbers as command-line arguments.");
            return;
        }

        int evenCount = 0;
        int oddCount = 0;

        for (String arg : args) {
            int number = Integer.parseInt(arg);

            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);
    }
}