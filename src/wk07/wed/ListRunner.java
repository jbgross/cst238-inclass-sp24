package wk07.wed;
import java.util.*;
public class ListRunner {
    public static void main(String[] args) {
        Random rand = new Random(7);
        List l = new List();
        for(int i = 0; i < 10; i++) {
            l.append(rand.nextInt(10));
        }
        System.out.println(l);

        l.delete(2);
        System.out.println(l);
        for(int i = 0; i < 4; i++) {
            l.delete(1);
        }
        System.out.println(l);
        l.insert(7, 4);
        System.out.println(l);
        l.insert(2,0);
        System.out.println(l);

        Queue q = new Queue();
        for(int i = 0; i < 6; i++) {
            q.enqueue(rand.nextInt(10));
        }
        System.out.println(q);
        System.out.println(q.dump());
        for(int i = 0; i < 4; i++) {
            q.dequeue();
        }
        System.out.println(q);
        System.out.println(q.dump());
        for(int i = 0; i < 3; i++) {
            q.enqueue(rand.nextInt(10));
        }
        System.out.println(q);
        System.out.println(q.dump());
    }
}
