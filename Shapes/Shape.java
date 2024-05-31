package Shapes;

import java.awt.*;

public abstract class Shape {
    protected int size;
    protected Point center;
    protected Color color;

    public Shape(int iSize, Point location, Color C) {
        setSize(iSize);
        setLocation(location);
        setColor(C);
    }

    public void setSize(int iSize) {
        if (iSize > 1) {
            size = iSize;
        } else {
            size = 1;
        }
    }

    public void setLocation(Point Pcenter) {
        center = Pcenter;
    }

    public void setColor(Color Ccolor) {
        color = Ccolor;
    }

    public int getSize() {
        return size;
    }

    public Point getCenter() {
        return center;
    }

    public Color getColor() {
        return color;
    }

    //abstract drawing function, implemented in child class Circle and Rectangles,
    public abstract void draw(Graphics g);

}



