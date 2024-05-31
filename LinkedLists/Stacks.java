package LinkedLists;

import Shapes.Shape;

import java.util.ArrayList;

public class Stacks {
    public Node head;
    public Node top;

    public Stacks() {
        head = null;
        top = null;
    }

    public ArrayList<Shape> traversal() {
        Node temp = this.head; //temporary pointer to point to head

        ArrayList<Shape> shapeA = new ArrayList<>();
        while (temp != null) { //iterating over stack

            shapeA.add(temp.data); //adding shape to arraylist
            temp = temp.next;
        }


        return shapeA;

    }

    //checks whether node is empty or not
    public boolean isEmpty() {
        if (this.top == null)
            return true;
        return false;
    }

    //pushes shape down the stack
    public void push(Node n) {
        if (this.isEmpty()) {
            this.head = n;
            this.top = n;
        } else {
            this.top.next = n;
            this.top = n;
        }
    }

    public Shape pop() {
        if (this.isEmpty()) {
            System.out.println("no shapes" + "");
            return null;
        } else {
            Shape x = this.top.data;
            if (this.head == this.top) {// checks whether there is only one node
                this.top = null;
                this.head = null;
            } else {
                Node temp = this.head;
                while (temp.next != this.top) // iterating to the last element
                    temp = temp.next;
                temp.next = null;
                this.top = temp;
            }
            return x;
        }
    }
}




