/*Write a Java program to find the largest among three numbers using command-line arguments.
The program should:

Accept three integers as command-line arguments
Compare them using conditional logic
Display the largest number
*/
public class LargestNumberCLI {
    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Please provide exactly 3 numbers.");
            return;
        }

        int largest = Integer.parseInt(args[0]);

        for (int i = 1; i < args.length; i++) {
            int number = Integer.parseInt(args[i]);
            largest = Math.max(largest, number);
        }

        System.out.println("Largest number: " + largest);
    }
}