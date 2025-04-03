public class cmd_line {
    public static void main(String[] args)
    {
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < 10; i++) {
            int number = Integer.parseInt(args[i]);
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
