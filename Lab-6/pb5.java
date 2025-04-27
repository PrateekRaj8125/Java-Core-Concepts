class CheckArgument extends Exception {
    public CheckArgument(String message) {
        super(message);
    }
}

public class pb5 {
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
