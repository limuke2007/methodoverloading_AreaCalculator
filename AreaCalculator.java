package java_masterclass;

public class AreaCalculator {
    private static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }
        return Math.PI * radius * radius;
    }

    private static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1;
        }
        return x * y;
    }

    public static void main(String[] args) {
        System.out.println(area(5));
        System.out.println(area(9, 10));
    }

}
