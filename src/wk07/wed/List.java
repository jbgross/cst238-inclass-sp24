package wk07.wed;

public class List {
    private int size;
    public static final int CAPACITY = 10;
    private int [] data;

    public List() {
        size = 0;
        data = new int[CAPACITY];
//        int [] a = new int[5];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void append(int value) {
        if(size == data.length) {
            System.out.println("list is full, cannot append " + value);
            return;
        }

        data[size++] = value;
    }

    public void delete(int pos) {
        if(pos < 0 || pos >= size) {
            System.out.println(pos + " is not a valid index");
            return;
        }

        // left shift
        for(int i = pos; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
        data[size] = 0;
    }

    public void insert(int value, int pos) {
        if(size == data.length) {
            System.out.println("list is full");
            return;
        }

        if(pos < 0 || pos > size) {
            System.out.println(pos + " is not a valid index");
            return;
        }

        // right shift
        for(int i = size; i > pos; i--) {
            data[i] = data[i - 1];
        }
        data[pos] = value;
        size++;
    }

    public String toString() {
        if(isEmpty()) {
            return "empty list";
        }

        StringBuilder sb = new StringBuilder("[");
        for(int i = 0; i < size; i++) {
            sb.append(data[i]).append(" ");
        }
        sb.append("]");
        return sb.toString();
    }
}
