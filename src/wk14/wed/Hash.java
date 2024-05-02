package wk14.wed;

public class Hash {

    private int [][] data;
    public static final int DEFAULT_SIZE = 5;

    public Hash(){
        data = new int[2][DEFAULT_SIZE];
    }

    public int hash(int value) {
        return Math.abs(value%data.length);
    }

    public void set(int key, int value) {
        int hashCode = hash(key);
        if(data[1][hashCode] != 0) {
            System.out.println("collision at key " + hashCode);
            return;
        }
        data[0][hashCode] = key;
        data[1][hashCode] = value;
    }

    public int get(int key) {
        int hashCode = hash(key);
        return data[1][hashCode];
    }

    public void dump() {
        for(int i = 0; i < data.length; i++) {
            System.out.printf("%d: %d%n", i, data[i]);
        }
    }
}
