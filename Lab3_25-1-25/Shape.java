public class Shape {
    public double area(double radius) {
        return Math.PI * radius * radius;
    }
    public double area(double base, double height) {
        return 0.5 * base * height;
    }
    public double area(int side) {
        return side * side;
    }
}
