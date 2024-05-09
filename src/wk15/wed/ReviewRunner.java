package wk15.wed;

public class ReviewRunner {

    public static void main(String[] args) {
        BST b1 = new BST();
        System.out.println("shortest leaf: " + b1.shortestLeaf());
        b1.inOrder();
        b1.add(7);
        b1.add(5);
        b1.inOrder();
        System.out.println("shortest leaf: " + b1.shortestLeaf());
    }
}
