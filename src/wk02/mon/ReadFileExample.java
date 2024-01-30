package wk02.mon;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileExample {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        System.out.print("enter filename: ");
        String filename = s.next();
        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);
        Scanner in = new Scanner(br);

        int size = in.nextInt();
        int [] data = new int[size];

        int index = 0;
        while(in.hasNextInt() && index < data.length) {
            int input = in.nextInt();
            data[index] = input;
            index++;
        }

        fr.close();

        for(int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();

        for(int value : data) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
