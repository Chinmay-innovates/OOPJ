class Shape {
    void draw() {
    }

    double getArea() {
        return 0;
    }
}

class Circle extends Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    double getArea() {
        System.out.println("Area : " + Math.PI * r * r);
        return Math.PI * r * r;
    }
}

class Triangle extends Shape {
    private double b;
    private double h;

    public Triangle(double b, double h) {
        this.b = b;
        this.h = h;
    }

    @Override
    void draw() {
        System.out.println("Drawing Triangle");
    }

    @Override
    double getArea() {
        System.out.println("Area : " + 0.5 * b * h);
        return 0.5 * b * h;
    }

}

class Rectangle extends Shape {
    private double l;
    private double b;

    public Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }

    @Override
    double getArea() {
        System.out.println("Area : " + l * b);

        return l * b;
    }

}

class Square extends Shape {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    void draw() {
        System.out.println("Drawing Square");
    }

    @Override
    double getArea() {
        System.out.println("Area : " + a * a);
        return a * a;
    }

}

/**
 * GetShapeArea
 */
public class GetShapeArea {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(5, 6);
        Triangle t = new Triangle(5, 8);
        Square s = new Square(5);

        // c.draw();
        // c.getArea();

        // r.draw();
        // r.getArea();

        // t.draw();
        // t.getArea();

        // s.draw();
        // s.getArea();
    }
}
