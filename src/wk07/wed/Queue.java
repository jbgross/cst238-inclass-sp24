package wk07.wed;

public class Queue {
    private int front;
    private int back;
    private int [] data;
    public static final int CAPACITY = 7;

    public Queue() {
        front = 0;
        back = 0;
        data = new int[CAPACITY];
    }

    public boolean isEmpty() {
        return front == back;
    }

    public void enqueue(int value) {
        int newBack = (back + 1)%data.length;
        if(newBack == front) {
            System.out.println("Cannot enqueue " + value + "; queue full");
            return;
        }

        data[back] = value;
        back = newBack;
    }

    public void dequeue() {
        if(isEmpty()) {
            System.out.println("Cannot dequeue; empty queue");
            return;
        }

        front = (front + 1)%data.length;
    }

    public String toString() {
        if(isEmpty()) {
            return "Empty queue";
        } else {
            StringBuilder sb = new StringBuilder("Queue: ");

            for(int i = front; i != back; i = (i+1)%data.length) {
                sb.append(data[i]).append(" ");
            }
            return sb.toString();
        }
    }

    public String dump() {
        StringBuilder topRow = new StringBuilder("Value: ");
        StringBuilder bottowRow = new StringBuilder("Index: ");
        for(int i = 0; i < data.length; i++) {
            topRow.append(data[i]).append(" ");
            bottowRow.append(i).append(" ");
        }
        return topRow + "\n" + bottowRow;
    }
}
