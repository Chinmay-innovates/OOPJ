import javax.swing.*;
import java.awt.*;

public class CircleDrawing extends JFrame {

    public CircleDrawing() {
        setTitle("Circle Drawing Example");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame on the screen
    }

    public void paint(Graphics g) {
        super.paint(g); // Call the paint method of the parent class

        int centerX = getWidth() / 2; // X-coordinate of the center of the circle
        int centerY = getHeight() / 2; // Y-coordinate of the center of the circle
        int radius = 100; // Radius of the circle

        // Draw the circle using Graphics object
        g.setColor(Color.RED); // Set color to red
        g.fillOval(centerX - radius, centerY - radius, 2 * radius, 2 * radius); // Draw filled circle
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CircleDrawing circleDrawing = new CircleDrawing();
            circleDrawing.setVisible(true);
        });
    }
}
