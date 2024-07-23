
// Abstract Shape class
abstract class Shape {
    public abstract void draw();

    public abstract double getArea();
}

// Circle class that extends Shape
class Circle extends Shape {
    private double radius;

    // Constructor for Circle
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to draw a circle
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

    // Method to calculate the area of a circle
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }


}

// Rectangle class that extends Shape
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor for Rectangle
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to draw a rectangle
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }

    // Method to calculate the area of a rectangle
    @Override
    public double getArea() {
        return length * width;
    }
}

// Square class that extends Shape
class Square extends Shape {
    private double side;

    // Constructor for Square
    public Square(double side) {
        this.side = side;
    }

    // Method to draw a square
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }

    // Method to calculate the area of a square
    @Override
    public double getArea() {
        return side * side;
    }
}

// Triangle class that extends Shape
class Triangle extends Shape {
    private double base;
    private double height;

    // Constructor for Triangle
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Method to draw a triangle
    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }

    // Method to calculate the area of a triangle
    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}

// Main class to demonstrate the usage of Shape and its subclasses
public class GetAbstractShapeArea {
    public static void main(String[] args) {
        // Creating objects of different shapes
        Shape c = new Circle(5.4);
        Shape r = new Rectangle(4.5, 6.2);
        Shape s = new Square(4.5);
        Shape t = new Triangle(3.5, 4.8);

        // Drawing and calculating areas of shapes
        c.draw();
        System.out.println("Area of Circle: " + c.getArea());

        r.draw();
        System.out.println("Area of Rectangle: " + r.getArea());

        s.draw();
        System.out.println("Area of Square: " + s.getArea());

        t.draw();
        System.out.println("Area of Triangle: " + t.getArea());
    }
}
