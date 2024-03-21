package wk09.mon;
import java.util.*;
public class BubbleSort {

    public static void main(String[] args) {
//        int [] a = {5, 8};
//        swap(a, 0, 1);
//        System.out.println(a[0] + " " + a[1]);
//
//        int x = 2, y = 6;
//        badSwap(x, y);
//        System.out.println(x + " " + y);
//        int x = 5;
//        x = x + 5;
//        x += 5;
//        x++;

        int size = 15;
        int [] data = new int[size];
        Random rand = new Random(7);

        for(int i = 0; i < data.length; i++) {
            data[i] = rand.nextInt(size);
//            data[i] = Math.abs(rand.nextInt())%size;
        }
        print(data);
        bubbleSort(data);
        print(data);
    }

    public static void bubbleSort(int [] data) {
        for(int k = 0; k < data.length - 1; k++) {
            boolean wasSwap = false;
            for (int i = 0; i < data.length - 1 - k; i++) {
                if (data[i] > data[i + 1]) {
                    wasSwap = true;
                    // data must be out of order
                    swap(data, i, i + 1);
                }
            }
            print(data);
            if(! wasSwap) {
                System.out.println("early exit at k = " + k);
                break;
            }
        }
    }

    public static void print(int [] data) {
        for(int i : data) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void badSwap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }

    public static void swap(int [] data, int index1, int index2) {
        int temp = data[index2];
        data[index2] = data[index1];
        data[index1] = temp;
    }
}
