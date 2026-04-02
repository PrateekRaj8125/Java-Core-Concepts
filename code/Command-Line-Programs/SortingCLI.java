/*Write a Java program to sort a list of integers using command-line arguments.
The program should:

Accept 10 integers as command-line arguments
Sort them in ascending order
Display the sorted list
*/
public class SortingCLI {
    public static void main(String[] args) {

        if (args.length != 10) {
            System.out.println("Please provide exactly 10 numbers.");
            return;
        }

        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }

        // Sorting (Selection/Bubble-like logic)
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        System.out.println("Sorted numbers:");

        for (int i = 0; i < numbers.length; i++) {
            if (i != numbers.length - 1)
                System.out.print(numbers[i] + ", ");
            else
                System.out.print(numbers[i]);
        }
    }
}