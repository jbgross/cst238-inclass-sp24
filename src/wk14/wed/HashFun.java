package wk14.wed;
import java.util.*;
public class HashFun {

    public static void main(String [] args) {
        Map<String, String> dictionary = new TreeMap<>();
        dictionary.put("ball", "a round thing");
        dictionary.put("triangle", "a pointy thing");
        System.out.println(dictionary.get("triangle"));
        Hash h1 = new Hash();
        h1.set(15, 207);
        h1.set(683, 22);
        h1.set(1000, 44);
        System.out.println(h1.get(15));
        System.out.println(h1.get(683));
//        h1.dump();
//        for(int i = 0; i < 20; i++) {
//            System.out.print(hash(i, 10) + " ");
//        }
    }

    public static int hash(int value, int size) {
        return Math.abs(value%size);
    }
}
