import javax.swing.*;
import java.awt.*;

public class StringToColorExample {
    public static String stringToColor(String str) {
        // Hash the string to a number
        int hash = 0;
        for (int i = 0; i < str.length(); i++) {
            hash = str.charAt(i) + ((hash << 5) - hash);
        }

        // Extract RGB values
        int r = (hash >> 24) & 0xFF;
        int g = (hash >> 16) & 0xFF;
        int b = (hash >> 8) & 0xFF;

        // Ensure the values are within the 0-255 range
        r = r & 0xFF;
        g = g & 0xFF;
        b = b & 0xFF;

        // Construct the hex color code
        String color = String.format("#%02X%02X%02X", r, g, b);
        return color;
    }

    public static Color hexToColor(String hex) {
        return new Color(
            Integer.valueOf(hex.substring(1, 3), 16),
            Integer.valueOf(hex.substring(3, 5), 16),
            Integer.valueOf(hex.substring(5, 7), 16)
        );
    }

    public static void main(String[] args) {
        // Example usage
        String inputString = "RandomString";
        String colorHex = stringToColor(inputString);
        Color color = hexToColor(colorHex);

        // Create a JFrame to demonstrate the color
        JFrame frame = new JFrame("String to Color Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a JPanel and set its background color
        JPanel panel = new JPanel();
        panel.setBackground(color);

        frame.add(panel);
        frame.setVisible(true);
    }
}

