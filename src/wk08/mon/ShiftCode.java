package wk08.mon;

public class ShiftCode {
    public static void main(String[] args) {
        int [] data = new int[10];

        for(int i = 0; i < 10; i++) {
            data[i] = data[i%2];
        }

        int front = 0, back = 0;
        for(int i = front; i != back; i=(i+1)% data.length) {

        }
    }
}
