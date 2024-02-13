package wk04.mon;

public class QueueRunner {
    public static void main(String[] args) {
        Queue q1 = new Queue();
        System.out.println(q1.isEmpty());
        for(int i = 0; i < 11; i++) {
            q1.enqueue(i);
        }
        System.out.println(q1.isEmpty());
    }
}
