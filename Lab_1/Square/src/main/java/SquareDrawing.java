import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Dimension;

public class SquareDrawing extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Cast Graphics to Graphics2D
        Graphics2D g2d = (Graphics2D) g;
        
        // Set square properties
        int sideLength = 200;
        int halfSide = sideLength / 2;
        
        // Find the center coordinates of the screen (panel)
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        
        // Mark all four coordinates around the center
        int topLeftX = centerX - halfSide;
        int topLeftY = centerY - halfSide;
        
        int topRightX = centerX + halfSide;
        int topRightY = centerY - halfSide;
        
        int bottomRightX = centerX + halfSide;
        int bottomRightY = centerY + halfSide;
        
        int bottomLeftX = centerX - halfSide;
        int bottomLeftY = centerY + halfSide;
        
        g2d.setColor(Color.BLACK);
        
        // Draw lines between the adjacent vertices
        g2d.drawLine(topLeftX, topLeftY, topRightX, topRightY);       // Top line
        g2d.drawLine(topRightX, topRightY, bottomRightX, bottomRightY); // Right line
        g2d.drawLine(bottomRightX, bottomRightY, bottomLeftX, bottomLeftY); // Bottom line
        g2d.drawLine(bottomLeftX, bottomLeftY, topLeftX, topLeftY);   // Left line
    }
    
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(300, 300);
    }

    public static void main(String[] args) {
        // Create the JFrame
        JFrame frame = new JFrame("Square Drawing using Graphics2D");
        SquareDrawing squarePanel = new SquareDrawing();
        
        frame.add(squarePanel);
        frame.pack(); // Sizes the frame so that all its contents are at or above their preferred sizes
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center the window on the screen
        frame.setVisible(true);
    }
}
