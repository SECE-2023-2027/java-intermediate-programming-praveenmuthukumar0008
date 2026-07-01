class AreaCalculator {

    // Calculate area of a circle
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Calculate area of a rectangle
    public static double calculateArea(double length, double width) {
        return length * width;
    }

    // Calculate area of a square
    public static double calculateArea(int side) {
        return side * side;
    }
}

public class Main {
    public static void main(String[] args) {

        // Circle
        System.out.println(AreaCalculator.calculateArea(5.0));

        // Rectangle
        System.out.println(AreaCalculator.calculateArea(4.0, 5.0));

        // Square
        System.out.println(AreaCalculator.calculateArea(4));
    }
}          