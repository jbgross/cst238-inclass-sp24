package wk13.mon;

public class TreeRunner {
    public static void main(String[] args) {

        BST b1 = new BST();
        System.out.println(b1.size());
        b1.add(5);
        b1.add(2);
        b1.add(7);
        System.out.println(b1.search(5));
        System.out.println(b1.search(2));
        System.out.println(b1.search(1000));
        System.out.println(b1.size());

    }
}
