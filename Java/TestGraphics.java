import graphics.*;

public class TestGraphics {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(10, 5);
        Triangle t = new Triangle(6, 4);
        Square s = new Square(5);
        Circle c = new Circle(3);

        System.out.println("Rectangle Area: " + r.area());
        System.out.println("Triangle Area: " + t.area());
        System.out.println("Square Area: " + s.area());
        System.out.println("Circle Area: " + c.area());
    }
}