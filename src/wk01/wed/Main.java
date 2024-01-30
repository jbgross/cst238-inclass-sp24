package wk01.wed;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
//        int x = foo();
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        int maxGuesses = 4;
        int [] guesses = new int[maxGuesses];
        int max = 10;
        int min;
        System.out.print("Enter the minimum: ");
        min = in.nextInt();
        int secret = Math.abs(rand.nextInt())%max + min;
        int count = 0;
//        double u = 5/2;
//        System.out.println("u = " + u);
        System.out.println("secret = " + secret);
        int guess;
        do {
            guess = getValidNumber(min, max, in);
            System.out.println("guess = " + guess);
//            if (guess == secret) {
//                System.out.println("You are correct!");
//            } else
            if(guess > secret) {
                System.out.println("Number too high!");
            } else if (guess > secret){
                System.out.println("Number too low");
            }
            guesses[count] = guess;
            System.out.println(++count);
        } while(guess != secret && count < guesses.length);
        System.out.println("It took you " + count + " guesses");
//        System.out.println(rand.nextInt());

        System.out.println("Here are your guesses: ");
        FileWriter fw = new FileWriter("out.txt");
        PrintWriter bw = new PrintWriter(fw);
        for(int i = 0; i < count; i++) {
            System.out.print(guesses[i] + " ");
            bw.println(i);
        }
        System.out.println();
        if(guess == secret) {
            System.out.println("You guessed correctly");
        } else {
            System.out.println("You ran out of guesses");
        }

        fw.close();



    }

    public static int getValidNumber(int low, int high, Scanner s) {
        int guess;
        while(true) {
            System.out.print("Enter a number between " + low + " and " + high + ": ");
            guess = s.nextInt();
            if(guess >= low && guess <= high) {
                break; //continue
            }
            System.out.println(guess + " is not valid");
        }
        return guess;
    }

    public static void foo() {

    }
}