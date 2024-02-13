package wk04.mon;

public class Stack {
    private int [] data;
    private int top;

    public Stack() {
        data = new int[5];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int value) {
        if(top < data.length - 1) {
            top++;
            data[top] = value;
        } else {
            System.out.println("stack full, cannot add "
            + value);
        }
    }

    public void pop() {
        if(isEmpty()) {
            System.out.println("cannot pop empty stack");
        } else {
            top--;
//            --top;
        }
    }

    public int top() {
        if(isEmpty()) {
            System.out.println("no data in stack");
            return 0;
        } else {
            return data[top];
        }
    }

    public String toString() {
        if(isEmpty()) {
            return "empty stack";
        }
        StringBuilder sb = new StringBuilder("stack contents: ");
        for(int i = top; i >= 0; i--) {
            sb.append(data[i]).append(" ");
        }

        return sb.toString();
    }
}
