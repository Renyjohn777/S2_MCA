import java.util.Scanner;

// Interface
interface Shape {
    void area();
    void perimeter();
}

// Circle class implementing Shape
class Circle implements Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    public void area() {
        double a = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + a);
    }

    public void perimeter() {
        double p = 2 * 3.14 * radius;
        System.out.println("Perimeter of Circle = " + p);
    }
}

// Rectangle class implementing Shape
class Rectangle implements Shape {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    public void area() {
        double a = length * width;
        System.out.println("Area of Rectangle = " + a);
    }

    public void perimeter() {
        double p = 2 * (length + width);
        System.out.println("Perimeter of Rectangle = " + p);
    }
}

// Main class
public class circle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter radius: ");
                    double r = sc.nextDouble();
                    Circle c = new Circle(r);
                    c.area();
                    c.perimeter();
                    break;

                case 2:
                    System.out.print("Enter length: ");
                    double l = sc.nextDouble();
                    System.out.print("Enter width: ");
                    double w = sc.nextDouble();
                    Rectangle rect = new Rectangle(l, w);
                    rect.area();
                    rect.perimeter();
                    break;

                case 3:
                    System.out.println("Program Ended.");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 3);

        sc.close();
    }
}