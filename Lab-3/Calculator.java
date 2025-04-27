class Calculator {
    public int subtract(int a, int b) {
        return a - b;
    }
    public int subtract(int a, int b, int c) {
        return a - b - c;
    }
    public double subtract(double a, double b) {
        return a - b;
    }
    public double subtract(double a, int b) {
        return a - b;
    }
    public int subtract(int[] numbers) {
        int result = numbers[0];
        for(int i = 1; i < numbers.length; i++) {
            result -= numbers[i];
        }
        return result;
    }
}
