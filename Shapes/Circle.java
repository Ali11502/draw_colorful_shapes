package Shapes;

import java.awt.*;

public class Circle extends Shape {
    public Circle(int iSize, Point location, Color C) {
        super(iSize, location, C);
    }

    //gets related arguments  and draws circle, and implementation of abstract function in drawing class
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillOval(getCenter().x - getSize() / 2, getCenter().y - getSize() / 2, getSize(), getSize());
    }
}

