package wk04.mon;

public class Queue {
    private int [] data;
    private int front;
    private int back;
    public static final int DEFAULT_CAPACITY = 10;

    public Queue() {
        data = new int[DEFAULT_CAPACITY];
        front = 0;
        back = 0;
    }

    public boolean isEmpty() {
        return front == back;
    }

    public void enqueue(int value) {
        data[back] = value;
        back++;
    }

    public void dequeue() {
        if(isEmpty()) {
            System.out.println("cannot dequeue an empty queue");
        } else {
            front++;
        }
    }
}
