package wk13.mon;

import java.util.Random;

public class TreeRunner {
    public static void main(String[] args) {

        BST b1 = new BST();
        System.out.println(b1.size());
        Random rand = new Random(7);
        b1.add(5);
        b1.add(2);
        b1.add(7);
        b1.add(50);
        b1.add(-50);
        for(int i = 0; i < 20; i++) {
            b1.add(rand.nextInt(-20, 20));
        }
        System.out.println(b1.search(5));
        System.out.println(b1.search(2));
        System.out.println(b1.search(1000));
        System.out.println(b1.size());
        System.out.println("Inorder Traversal: ");
        b1.inOrder();
        b1.preOrder();
        b1.postOrder();

    }
}
