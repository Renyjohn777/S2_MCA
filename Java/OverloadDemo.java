import java.util.Scanner;

class AreaCalculator {

    // Area of Circle
    double area(double radius) {
        return 3.14 * radius * radius;
    }

    // Area of Rectangle
    double area(double length, double breadth) {
        return length * breadth;
    }

    // Area of Square
    int area(int side) {
        return side * side;
    }

    // Area of Triangle
    double area(float base, float height) {
        return 0.5 * base * height;
    }
}

public class OverloadDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AreaCalculator calc = new AreaCalculator();

        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        System.out.println("Area of Circle = " + calc.area(r));

        System.out.print("\nEnter length and breadth of rectangle: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Area of Rectangle = " + calc.area(l, b));

        System.out.print("\nEnter side of square: ");
        int s = sc.nextInt();
        System.out.println("Area of Square = " + calc.area(s));

        System.out.print("\nEnter base and height of triangle: ");
        float base = sc.nextFloat();
        float height = sc.nextFloat();
        System.out.println("Area of Triangle = " + calc.area(base, height));

        sc.close();
    }
}