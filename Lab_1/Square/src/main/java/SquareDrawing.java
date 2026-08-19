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
        int x = 50;
        int y = 50;
        int sideLength = 200;
        
        // Draw the outline of the square
        g2d.setColor(Color.BLACK);
        g2d.drawRect(x, y, sideLength, sideLength);
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
