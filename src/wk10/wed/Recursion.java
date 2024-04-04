package wk10.wed;

public class Recursion {

    public static void main(String[] args) {
//        foo();
        countDown(2);
        System.out.println();
        System.out.println(sum(2));
        int [] a = {5, 4, 9, 0};
        print(a, 5);
        System.out.println();
    }

    public static void print(int [] a, int size) {
        if(size > a.length) {
            System.out.println("size too big");
            return;
        } else if(size == 0) {
            return;
        } else {
            // print the value at size - 1
            System.out.print(a[size - 1] + " ");
            print(a, size - 1);
        }
        return;
    }

    public static int sum(int n) {
        if(n == 0) {
            return 0;
        } else {
            return n + sum(n - 1);
        }
    }

    public static void countDown(int x) {
        System.out.print(x + " ");
        if(x == 0) {
            return;
        } else {
            countDown(x - 1);
        }
//        System.out.print(x + " ");
        return;
    }

    public static void foo() {
        System.out.println("in foo");
        foo();
    }
}
