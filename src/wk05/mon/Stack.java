package wk05.mon;

public class Stack {
    public static final int INITIAL_CAPACITY = 10;
    private char [] data;
    private int top;

    public Stack() {
        data = new char[INITIAL_CAPACITY];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(char c) {
        if(top + 1 < data.length) {
            data[++top] = c;
        } else {
            System.out.println("stack full, cannot push " + c);
        }
    }

    public char top() {
        if(isEmpty()) {
            System.out.println("empty stack");
//            int x = 'x';
            return 0; // returning a junk value
        } else {
            return data[top];
        }
    }

    public String toString() {
        if(isEmpty()) {
            return "empty stack";
        } else {
            StringBuilder sb = new StringBuilder();
            for(int i = top; i >= 0; i--) {
                sb.append(data[i]).append(" ");
            }
            return sb.toString();
        }
    }

    public void pop() {
        if(! isEmpty()) {
            top--;
        } else {
            System.out.println("cannot pop empty stack");
        }
    }
}
