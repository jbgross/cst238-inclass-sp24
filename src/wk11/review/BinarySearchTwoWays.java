package wk11.review;

import java.util.Scanner;

public class BinarySearchTwoWays {

    public static void main(String[] args) {
        double [] data = new double[10];
        for(int i = 0; i < data.length; i += 2) {
            data[i] = (i + 1) * 0.11;
        }

        print(data);
//        shiftDown(data, 5, 1);
        fastInsertionSort(data);
        print(data);
//        insertionSort(data);
//        print(data);
//        Scanner in = new Scanner(System.in);
//        double input = 1;
//        while(input > 0) {
//            System.out.print("Search for number: ");
//            input = in.nextDouble();
//            int location = binarySearch(data, input);
//            if(location == -1) {
//                System.out.println("insert value at "
//                + insertionSearch(data, input));
//            } else {
//                System.out.println("Data located at " + location);
//            }
//
//        }
    }

    public static void fastInsertionSort(double [] data) {
        for(int i = 1; i < 10; i++) {
            int start = i;
            int stop = start;
            while (stop > 0 && data[start] < data[stop - 1]) {
                stop--;
            }
            if(start > stop) {
                shiftDown(data, start, stop);
            }
        }
    }

    public static void insertionSort(double [] data) {
        for(int i = 1; i < data.length; i++) {
            int k = i;
            while (k > 0) {
                if (data[k] < data[k - 1]) {
                    swap(data, k, k - 1);
                    k--;
                } else {
                    break;
                }
            }
        }
    }

    public static void shiftDown(double [] u, int start, int end) {
        if(end < 0 ||  start >= u.length || start <= end) {
            System.out.println("error");
            return;
        }

        double value = u[start];
        for(int i = start; i > end; i--) {
            u[i] = u[i - 1];
        }

        u[end] = value;
    }


    public static void swap(double [] data, int i1, int i2) {
        double temp = data[i1];
        data[i1] = data[i2];
        data[i2] = temp;
    }

    public static void print(double [] u) {
        for(double x : u) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static int binarySearch(double [] data, double value) {
        int first = 0;
        int last = data.length - 1;
        while(first <= last) {
            int middle = (first + last)/2;
            if(data[middle] == value) {
                return middle;
            } else if (data[middle] > value) {
                last = middle - 1;
            } else {
                first = middle + 1;
            }
        }
        return -1;
    }

    public static int insertionSearch(double [] data, double value) {
        int first = 0;
        int last = data.length - 1;
        while(first <= last) {
            int middle = (first + last)/2;
            if(data[middle] == value) {
                return middle;
            } else if (data[middle] > value) {
                last = middle - 1;
            } else {
                first = middle + 1;
            }
        }
        return first;
    }
}
