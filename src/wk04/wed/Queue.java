package wk04.wed;

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
        int newBack = (back + 1)%data.length;
        if(newBack == front) {
            System.out.println("queue full, cannot add "
                    + value);
            return;
        }
        data[back] = value;
        back = newBack;
    }

    public void dequeue() {
        if(isEmpty()) {
            System.out.println("cannot dequeue an empty queue");
        } else {
            front = (front + 1)%data.length;
        }

    }

    public String toString() {
        if (isEmpty()) {
            return "empty queue";
        } else {
            StringBuilder sb = new StringBuilder();
            for(int i = front; i != back; i=(i+1)%data.length) {
                sb.append(data[i]).append(" ");
            }

            return sb.toString();
        }
    }

    public String arrayContents() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < data.length; i++) {
            sb.append(data[i]).append(" ");
        }
        return sb.toString();
    }
}
