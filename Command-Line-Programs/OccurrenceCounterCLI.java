/*Write a Java program to count the occurrence of each number using command-line arguments.
The program should:

Accept multiple integers as command-line arguments
Count how many times each number appears
Display the occurrence of each unique number
 */
public class OccurrenceCounterCLI {
    public static void main(String[] args) {

        int[] num = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            num[i] = Integer.parseInt(args[i]);
        }

        boolean[] flag = new boolean[num.length];

        for (int i = 0; i < num.length; i++) {
            if (!flag[i]) {
                int count = 1;

                for (int j = i + 1; j < num.length; j++) {
                    if (num[i] == num[j]) {
                        count++;
                        flag[j] = true;
                    }
                }

                System.out.println("Occurrence of " + num[i] + " = " + count);
            }
        }
    }
}