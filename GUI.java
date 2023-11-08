import javax.swing.*;
import java.awt.*;

public class GUI {

    public GUI() {
        JFrame frame = new JFrame("My first Gui");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        JButton button = new JButton("Press");
        button.setBackground(Color.red);
        frame.getContentPane().add(button); // Adds Button to content pane of frame
        frame.getContentPane().setBackground(Color.green);
        frame.setVisible(true);

    }

    public static void main(String args[]) {
        new GUI();
    }
}
