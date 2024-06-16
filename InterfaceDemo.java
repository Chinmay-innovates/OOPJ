interface Shape {
    void area();

    void perimeter();

    double pi = Math.PI;
}

class Circle implements Shape {
    private double r;

    Circle(double r) {
        this.r = r;
    }

    public void area() {
        System.out.println("Area of Circle: " + pi * r * r + " sq.units");
    }

    public void perimeter() {
        System.out.println("Perimeter of Circle: " + 2 * pi * r + " units");
    }

}

class Rectangle implements Shape {
    private double l, b;

    Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    public void area() {
        System.out.println("Area of Rectangle: " + l * b + " sq.units");
    }

    public void perimeter() {
        System.out.println("Perimeter of Rectangle: " + 2 * (l + b) + " units");
    }

}

public class InterfaceDemo {
    public static void main(String args[]) {
        Circle c = new Circle(10.2);
        c.area();
        c.perimeter();

        Rectangle r = new Rectangle(12.6, 23.55);
        r.area();
        r.perimeter();
    }

}
