package wk12.mon;

public class LinkedListRunner {
    public static void main(String[] args) {
        LinkedList ll1 = new LinkedList();
        System.out.println("sum: " + ll1.sum());
        ll1.append(5);
        System.out.println(ll1);
        System.out.println("sum: " + ll1.sum());
        ll1.append(6);
        System.out.println(ll1);
        ll1.prepend(100);
        System.out.println(ll1);
        System.out.println("sum: " + ll1.sumRecursive());
//        String s = null;
//        System.out.println(s.toUpperCase());
    }
}
