import javax.swing.*;
import java.awt.*;

public class GUI {

    public GUI() {
        JFrame frame = new JFrame("My first Gui");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.getContentPane().setBackground(Color.BLACK);
        frame.setSize(300,300);
        JButton button = new JButton("Press");


        frame.getContentPane().add(button); // Adds Button to content pane of frame

        frame.setVisible(true);

    }

    public static void main(String args[]) {
        new GUI();
    }
}
