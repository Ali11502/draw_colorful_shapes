package LinkedLists;

import Shapes.Shape;

public class Node {
    public Shape data;
    public Node next;

    public Node(Shape shape) {
        this.data = shape;
        next = null;
    }
}


