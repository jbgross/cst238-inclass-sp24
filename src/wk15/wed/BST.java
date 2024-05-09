package wk15.wed;

public class BST {
    private Node root;

    public BST() {
        root = null;
    }

    public int shortestLeaf() {
        if(isEmpty()) {
            return 0;
        } else {
            return root.shortestLeaf();
        }
    }


    public boolean isEmpty() {
        return root == null;
    }

    public void inOrder() {
        if(isEmpty()) {
            System.out.println("Empty tree");
        } else {
            root.inOrder();
            System.out.println();
        }
    }

    public void add(int value) {
        if(isEmpty()) {
            root = new Node(value);
        } else {
            root.add(value);
        }
    }
}


class Node {
    private int data;
    private Node left;
    private Node right;

    public Node(int value) {
        data = value;
        left = null;
        right = null;
    }

    public boolean isLeaf() {
        return !hasLeft() && !hasRight();
    }

    public boolean hasLeft() {
        return left != null;
    }

    public boolean hasRight() {
        return right != null;
    }

    public int shortestLeaf() {
        if(isLeaf()) {
            return 1;
        } else if(hasLeft() && hasRight()) {
            int leftLeaf = left.shortestLeaf();
            int rightLeaf = right.shortestLeaf();
            if(leftLeaf < rightLeaf) {
                return 1 + leftLeaf;
            } else {
                return 1 + rightLeaf;
            }

        } else if(hasLeft()) {
            // only have a left node
            return 1 + left.shortestLeaf();
        } else {
            // only have a right node
            return 1 + right.shortestLeaf();
        }


    }

    public void inOrder() {
        if(hasLeft()) {
            left.inOrder();
        }

        System.out.print(data + " ");

        if(hasRight()) {
            right.inOrder();
        }
    }

    public void add(int value) {
        if(value < data) {
            // node should go to the left
            if(hasLeft()) {
                // value goes to left, but we already have a left node
                left.add(value);
            } else {
                // create a new node
                left = new Node(value);
            }
        } else if(value > data) {
            // node should go to the right
            if(hasRight()) {
                right.add(value);
            } else {
                right = new Node(value);
            }
        } else {
            // ignore duplicates
        }
    }


}