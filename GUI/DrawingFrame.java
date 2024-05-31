package GUI;

import javax.swing.*;

class DrawingFrame extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Drawing Program");
        frame.setDefaultCloseOperation(3);

        DrawingPanel panel = new DrawingPanel();
        frame.add(panel);

        frame.pack();
        frame.setVisible(true);
    }
}
