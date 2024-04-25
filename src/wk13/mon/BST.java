package wk13.mon;

public class BST {
    private Node root;

    public BST() {
        root = null;
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

    public void preOrder() {
        if(isEmpty()) {
            System.out.println("Empty tree");
        } else {
            root.preOrder();
            System.out.println();
        }
    }

    public void postOrder() {
        if(isEmpty()) {
            System.out.println("Empty tree");
        } else {
            root.postOrder();
            System.out.println();
        }
    }


    public int size() {
        if (isEmpty()) {
            return 0;
        }
        return root.size();
    }

    public boolean search(int value) {
        if (isEmpty()) {
            return false;
        } else {
            return root.search(value);
        }
    }

    public void add(int value) {
        if (isEmpty()) {
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

    public boolean hasLeft() {
        return left != null;
    }

    public boolean hasRight() {
        return right != null;
    }

    public void preOrder() {
        System.out.print(data + " ");

        if(hasLeft()) {
            left.inOrder();
        }

        if(hasRight()) {
            right.inOrder();
        }
    }

    public void postOrder() {
        if(hasRight()) {
            right.inOrder();
        }


        if(hasLeft()) {
            left.inOrder();
        }

        System.out.print(data + " ");
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

    public boolean search(int value) {
//        return value == data;
        if (value == data) {
            return true;
        } else if (value < data) {
            // go to left
//            return hasLeft() && left.search(value);
            if(hasLeft()) {
                return left.search(value);
            } else {
                return false;
            }
        } else {
            // go to right
//            return hasRight() && right.search(value);
            if(hasRight()) {
                return right.search(value);
            } else {
                return false;
            }
        }
    }

    public int size() {
        int count = 1;
        if (hasLeft()) {
            count += left.size();
        }

        if (hasRight()) {
            count += right.size();
        }
        return count;
    }

    public void add(int value) {
        if (value < data) {
            // go to left
            if (hasLeft()) {
                // have a left node
                left.add(value);
            } else {
                // no left node
                left = new Node(value);
            }
        } else if (value > data) {
            // go to the right
            if (hasRight()) {
                right.add(value);
            } else {
                right = new Node(value);
            }
        } else {
            System.out.println("I already have that value");
        }

    }
}