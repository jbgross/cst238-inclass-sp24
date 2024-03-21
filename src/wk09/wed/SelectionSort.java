package wk09.wed;

import java.util.Random;

public class SelectionSort {

    public static void main(String[] args) {
        int size = 15;
        int[] data = new int[size];
        Random rand = new Random(7);

        for (int i = 0; i < data.length; i++) {
            data[i] = rand.nextInt(size);
//            data[i] = Math.abs(rand.nextInt())%size;
        }
        print(data);
        selectionSort(data);
        print(data);
    }

    public static void selectionSort(int[] data) {
        for (int k = 0; k < data.length - 1; k++) {
            int smallestIndex = k;
            for (int i = k + 1; i < data.length; i++) {
                if (data[i] < data[smallestIndex]) {
                    smallestIndex = i;
                }

            }
            if(k != smallestIndex) {
                swap(data, k, smallestIndex);
            }
        }
    }


    public static void print(int[] data) {
        for (int i : data) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


    public static void swap(int[] data, int index1, int index2) {
        int temp = data[index2];
        data[index2] = data[index1];
        data[index1] = temp;
    }
}
