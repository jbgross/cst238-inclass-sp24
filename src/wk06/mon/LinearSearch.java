package wk06.mon;
import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        int size = 15;
        Random rand = new Random(6);
        int [] data = new int[size];
        for(int i = 0; i < data.length; i++) {
            data[i] = rand.nextInt(size) + 1;
        }
        print(data);
        int [] x = {7, 8, 9};
//        System.out.println(search(x, 7));
//        System.out.println(search(x, 8));
//        System.out.println(search(x, 6));
        int input = 1;
        Scanner in = new Scanner(System.in);
        while(input != 0) {
            System.out.print("Enter a number (1, " + size + "): ");
            input = in.nextInt();
            System.out.println(search(data, input));
            System.out.println("Reverse: " + reverseSearch(data, input));
        }
        System.out.println("Max: " + maxValue(data));
    }

    public static int maxValue(int [] d) {
//        int maxValue = d[0];
        int maxValue = Integer.MIN_VALUE;
        for(int i = 0; i < d.length; i++) {
            if(d[i] > maxValue) {
                maxValue = d[i];
            }
        }
        return maxValue;
    }
     public static int maxIndex(int [] d) {
        if(d.length == 0) {
            return -1;
        }
         int maxIndex = 0;
         for(int i = 1; i < d.length; i++) {
             if(d[i] > d[maxIndex]) {
                 maxIndex = i;
             }
         }
         return maxIndex;
     }

    public static int reverseSearch(int [] d, int value) {
        for(int i = d.length - 1; i > -1; i--) {
            if(d[i] == value) {
                return i;
            }
        }
        return -1;
    }
    public static int subSearch(int [] d, int value) {
        for(int i = 0; i < d.length; i++) {
            if(d[d.length - i - 1] == value) {
                return i;
            }
        }
        return -1;
    }
    public static int search(int [] d, int value) {
        for(int i = 0; i < d.length; i++) {
            if(d[i] == value) {
                return i;
            }
//              else {
//                return -1;
//            }
        }

        return -1;
    }

    public static void print(int [] a) {
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
