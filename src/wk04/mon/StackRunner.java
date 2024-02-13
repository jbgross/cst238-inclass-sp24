package wk04.mon;

public class StackRunner {
    public static void main(String[] args) {
//        int [] a = {};
//        a[0] = 5;
        Stack s1 = new Stack();
        System.out.println(s1.isEmpty());
        for(int i = 0; i < 5; i++) {
            s1.push(i);
        }
        System.out.println(s1.isEmpty());
        System.out.println(s1);
        while(! s1.isEmpty()) {
            s1.pop();
        }
        System.out.println(s1);
    }
}
