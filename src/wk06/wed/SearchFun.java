package wk06.wed;

import java.util.Arrays;

public class SearchFun {
    public static void main(String[] args) {
        int [] a = {2, 4, 6, 3, 9, 7, 5, 10, -4, 0, 9, 2};
        int search = 9;
        Arrays.sort(a);
        print(a);
        System.out.println("searching for " + search + ": " +
                linearSearch(a, search));
        System.out.println("searching for " + search + ": " +
                binarySearch(a, search));
    }

    public static boolean isSorted(int [] a) {
        for(int i = 0; i < a.length - 1; i++) {
            if(a[i] > a[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void print(int [] a) {
        for(int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static int linearSearch(int [] a, int value) {
        for(int i = 0; i < a.length; i++) {
            if(a[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int [] a, int value) {
        int low = 0;
        int high = a.length - 1;
        while(low <= high) {
            int mid = (low + high)/2;
            if(a[mid] == value) {
//                return mid;
                for(int i = mid; i > 0; i--) {
                    if(a[i] != a[i - 1]) {
                        return i;
                    }
                }
            } else if (a[mid] > value) {
                // left
                high = mid - 1;
            } else {
                // right side
                low = mid + 1;
            }
        }
        return -1;
    }
}
