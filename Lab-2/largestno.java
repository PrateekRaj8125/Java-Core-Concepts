public class largestno {
    public static void main(String[] args) {
        int largest = Integer.parseInt(args[0]);
        for (int i = 1; i < 3; i++) {
            int number = Integer.parseInt(args[i]);
            largest=largest>number?largest:number;
        }
        System.out.println("Largest number: " + largest);
    }
}
