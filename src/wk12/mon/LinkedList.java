package wk12.mon;

public class LinkedList {

    private Node first;

    public LinkedList() {
        System.out.println("LinkedList constructor: " + this);
        first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void prepend(int value) {
        if(isEmpty()) {
            first = new Node(value);
        } else {
            Node newNode = new Node(value);
            newNode.setNext(first);
            first = newNode;
        }
    }

    public int sum() {
        if(isEmpty()) {
            return 0;
        } else {
            Node n = first;
            int sum = 0;
            while(n != null) {
                sum += n.getData();
                n = n.getNext();
            }
            return sum;
        }
    }

    public int sumRecursive() {
        if(isEmpty()) {
            return 0;
        } else {
            return first.sumRecursive();
        }
    }

    public void append(int value) {
        if(isEmpty()) {
            first = new Node(value);
        } else {
//            first.setNext(new Node(value));
            Node last = first;
            while(last.hasNext()) {
//            while(last != null) {
                last = last.getNext();
            }
            last.setNext(new Node(value));
        }
//        System.out.println("Location of first Node: " + first);
    }

    public String toString() {
        if(isEmpty()) {
            return "Empty list";
        } else {
            StringBuilder sb = new StringBuilder();
            Node n = first;
            while(n != null) {
                sb.append(n.toString()).append(" ");
                n = n.getNext();
            }

            return sb.toString();
        }
    }


}

class Node {
    // payload
    private int data;
    // reference to the next Node in the LinkedList
    private Node next;

    public Node(int data) {
        System.out.println("Node constructor: " + this);
        this.data = data;
        next = null;
    }

    public int sumRecursive() {
        if(hasNext()) {
            return data + getNext().sumRecursive();
        } else {
            return data;
        }
    }

    public Node getNext() {
        return next;
    }

    public boolean hasNext() {
        return next != null;
    }

    public void setNext(Node n) {
        next = n;
    }

    public String toString() {
        return ""+data;
    }

    public int getData() {
        return data;
    }
}
