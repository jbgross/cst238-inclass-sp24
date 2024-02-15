package wk04.wed;

public class QueueRunner {
    public static void main(String[] args) {
        Queue q1 = new Queue();
        System.out.println(q1.isEmpty());
        for(int i = 0; i < 11; i++) {
            q1.enqueue(i);
        }

        for(int i = 0; i < 6; i++) {
            q1.dequeue();
        }
        for(int i = 0; i < 4; i++) {
            q1.enqueue((i+1)*11);
        }
        System.out.println(q1);
        System.out.println(q1.arrayContents());
        System.out.println(q1.isEmpty());
    }
}
