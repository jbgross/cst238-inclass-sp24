package wk02.mon;

public class Student {
    // 1 = freshman, 2 = sophomore...
    private int year;

    private String id;

    private String name;

    public void setYear(int y) {
        if(year >= 1 && year <=5) {
            year = y;
        }
    }

    public int getYear() {
        return year;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}
