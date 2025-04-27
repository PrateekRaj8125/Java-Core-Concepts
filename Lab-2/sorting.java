public class sorting {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }
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
        for (int i = 0; i < 10-1; i++) {
            System.out.print(numbers[i]+",");
        }
        System.out.println(numbers[10-1]);
    }
}
