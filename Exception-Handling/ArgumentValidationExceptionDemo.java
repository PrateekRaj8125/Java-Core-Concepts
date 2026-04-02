/* Write a Java program to demonstrate user-defined exception handling with command-line arguments.
The program should:

Accept at least 4 integers as command-line arguments
Throw a custom exception if fewer than 4 arguments are provided
Calculate the sum of squares of the first 4 numbers
Handle:
    Custom exception (CheckArgument)
    Invalid number format (NumberFormatException)
*/
class CheckArgument extends Exception {
    public CheckArgument(String message) {
        super(message);
    }
}

public class ArgumentValidationExceptionDemo {
    public static void main(String[] args) {

        try {
            if (args.length < 4) {
                throw new CheckArgument("Exception occurred - CheckArgument: Less than four arguments passed.");
            }

            int sumOfSquares = 0;

            for (int i = 0; i < 4; i++) {
                int num = Integer.parseInt(args[i]);
                sumOfSquares += num * num;
            }

            System.out.println("Output: " + sumOfSquares);

        } catch (CheckArgument e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Exception occurred: Invalid number format.");
        }
    }
}