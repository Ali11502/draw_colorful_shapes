package GUI;


import LinkedLists.Node;
import LinkedLists.Stacks;
import Shapes.Circle;
import Shapes.Rectangle;
import Shapes.Shape;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Random;


public class DrawingPanel extends JPanel implements MouseListener, MouseMotionListener {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    // PROPERTIES
    private final int DEFAULT_WIDTH = 600;
    private final int DEFAULT_HEIGHT = 600;

    private int x1, y1;// x2, y2;

    private Graphics g;

    public Circle circle;
    public Rectangle rectangle;
    public Random random = new Random();
    boolean a = true;
    Shape shapes;
    Stacks stacks = new Stacks();
    Node node;

    // CONSTRUCTOR
    public DrawingPanel() {
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));


        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    // METHOD
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

    //int count = 0;

    //takes graphics for drawing
    private void setUpDrawingGraphics() {
        g = getGraphics();
        update(g);//updates screen
        ArrayList<Shape> shapeA = stacks.traversal();//iterates over stack
        for (Shape shape : shapeA) {
            shape.draw(g);// draws shape after updating screen
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        if (SwingUtilities.isLeftMouseButton(e)) {
            x1 = e.getX();
            y1 = e.getY();
            if (a == true) {
                shapes = new Circle(50, new Point(x1, y1), new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
                node = new Node(shapes);
                stacks.push(node);
                g = getGraphics();
            }
            if (a == false) {
                shapes = new Rectangle(50, new Point(x1, y1), new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
                node = new Node(shapes);
                stacks.push(node);
            }
        }
        if (SwingUtilities.isRightMouseButton(e)) {
            stacks.pop();
            System.out.println("right pressed");
        }
        if (SwingUtilities.isMiddleMouseButton(e)) {
            a = !a;
            System.out.println("middle pressed");
        }
        setUpDrawingGraphics();

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}





