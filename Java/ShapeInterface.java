import java.util.*;

interface Shape {
    double area();
    double perimeter();
}

class Circle implements Shape {
    double r;

    Circle(double r) {
        this.r = r;
    }

    public double area() {
        return Math.PI * r * r;
    }

    public double perimeter() {
        return 2 * Math.PI * r;
    }
}

class Rectangle implements Shape {
    double l, w;

    Rectangle(double l, double w) {
        this.l = l;
        this.w = w;
    }

    public double area() {
        return l * w;
    }

    public double perimeter() {
        return 2 * (l + w);
    }
}

public class ShapeInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;

        do {
            System.out.println("1.Circle 2.Rectangle 3.Exit");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Radius: ");
                    Circle c = new Circle(sc.nextDouble());
                    System.out.println("Area = " + c.area());
                    System.out.println("Perimeter = " + c.perimeter());
                    break;

                case 2:
                    System.out.print("Length Width: ");
                    Rectangle r = new Rectangle(sc.nextDouble(), sc.nextDouble());
                    System.out.println("Area = " + r.area());
                    System.out.println("Perimeter = " + r.perimeter());
                    break;
            }
        } while (ch != 3);

        sc.close();
    }
}