package wk08.mon;

public class SimpleComplexity {
    public static void main(String[] args) {

    }

    public static int foo(int [] data) {
        int sum = 0;
        for(int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        return sum * data.length;
    }

    public static int bar(int [] data) {
        int sum = 0;
        for(int i = 0; i < data.length; i++) {
            for(int k = 0; k < data.length; k++) {
                sum += data[i];
            }
        }
        return sum;
    }
}
