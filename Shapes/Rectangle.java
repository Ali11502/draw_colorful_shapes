package Shapes;


import java.awt.*;

public class Rectangle extends Shape {
    public Rectangle(int iSize, Point location, Color C) {
        super(iSize, location, C);
    }

    //gets related arguments  and draws circle, and implementation of abstract function in Shape class
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillRect(getCenter().x - getSize() / 2, getCenter().y - getSize() / 2, getSize(), getSize());
    }
}



