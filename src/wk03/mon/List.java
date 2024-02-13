package wk03.mon;

public class List {
    private String [] data;
    private int size;
    public static final int DEFAULT_CAPACITY = 30;

    public List() {
        data = new String[DEFAULT_CAPACITY];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String firstLetters() {
        if(isEmpty()) {
            return "empty list";
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < size; i++) {
            sb.append(data[i].charAt(0));
        }

        return sb.toString();
    }

    public int charCount() {
        int count = 0;
        for(int i = 0; i < size; i++) {
            count += data[i].length();
        }
        return count;
    }

    public void insert(String s, int pos) {
        if(size >= data.length) {
            System.out.println("list full");
            return;
        }

        if(pos > size || pos < 0) {
            System.out.println("invalid position");
            return;
        }

        // shift to the right
        for(int i = size; i > pos; i--) {
            data[i] = data[i - 1];
        }
        data[pos] = s;
        size++;
    }

    public void delete(int index) {
        if(index >= size) {
            System.out.println("Invalid index");
        } else {
            // shift left to remove by iterating up
            for(int i = index; i < size - 1; i++) {
                data[i] = data[i + 1];
            }
            size--;
        }
    }

    public void append(String s) {
        if(size < data.length) {
            data[size++] = s;
        } else {
            System.out.println("list is full");
        }
    }

    public String toString() {
        if(size == 0) {
            return "empty list";
        } else {
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < size; i++) {
                sb.append(data[i]).append(" ");
            }
            return sb.toString();
        }
    }

}
