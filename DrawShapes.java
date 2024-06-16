import javax.swing.*;
import java.awt.*;

// Abstract Shape class
abstract class Shape {
    // Update to include Graphics parameter for drawing
    public abstract void draw(Graphics g); 
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
    public void draw(Graphics g) {
        // Cast Graphics object to Graphics2D for more advanced drawing operations
        Graphics2D g2d = (Graphics2D) g;
        int diameter = (int) (2 * radius); // Calculate diameter based on radius

        // Draw circle centered at (x, y) with the specified diameter
        g2d.drawOval(100, 100, diameter, diameter);
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
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawRect(100, 100, (int) length, (int) width); 
        // Draw rectangle at (100, 100) with specified dimensions
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
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawRect(100, 100, (int) side, (int) side); 
        // Draw square at (100, 100) with specified side length
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
    public void draw(Graphics g) {
        int[] xPoints = {100, 100 + (int) base, 100 + (int) (base / 2)}; // X-coordinates of triangle vertices
        int[] yPoints = {100, 100, 100 + (int) height}; // Y-coordinates of triangle vertices

        Graphics2D g2d = (Graphics2D) g;
        g2d.drawPolygon(xPoints, yPoints, 3); // Draw triangle with specified vertices
    }

    // Method to calculate the area of a triangle
    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}

// Main class to demonstrate the usage of Shape and its subclasses
public class DrawShapes {
    public static void main(String[] args) {
        // Creating JFrame for drawing
        JFrame frame = new JFrame("Drawing Shapes");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        // Drawing panel to draw shapes
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                // Create shapes and draw them
                Shape c = new Circle(50);
                Shape r = new Rectangle(80, 60);
                Shape s = new Square(70);
                Shape t = new Triangle(100, 80);

                c.draw(g); 
                r.draw(g); 
                s.draw(g); 
                t.draw(g); 
            }
        };

        frame.add(panel);
        frame.setVisible(true);
    }
}
