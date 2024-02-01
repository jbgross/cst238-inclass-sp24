package wk02.wed;

public class Coffee {
    private String [] syrups;
    public static final int MIN_SYRUPS = 2;
    public static final int MAX_SYRUPS = 5;
    private int syrupCount;
    private int sizeInOunces;

    public Coffee() {
        System.out.println("constructor called");
        syrups = new String[MIN_SYRUPS];
        syrupCount = 0;
    }

    public Coffee(int size) {
        sizeInOunces = size;
        if(sizeInOunces > 12) {
            syrups = new String[MAX_SYRUPS];
        } else {
            syrups = new String[MIN_SYRUPS];
        }
        syrupCount = 0;
    }

    public void addSyrup(String flavor) {
        if(syrupCount < syrups.length) {
            syrups[syrupCount++] = flavor;
        } else {
            System.out.println("too many syrups");
        }
    }

    public String [] getSyrups() {
        String [] copySyrups = new String[syrupCount];
        for(int i = 0; i < syrupCount; i++) {
            copySyrups[i] = syrups[i];
        }
        return copySyrups;
    }

    public String toString() {
        if(syrupCount == 0) {
            return "no syrups";
        } else {
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < syrupCount; i++) {
                sb.append(syrups[i]).append(", ");
            }
            return sb.toString();
        }
    }
}
