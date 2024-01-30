package wk02.mon;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.getYear());
        System.out.println(s1.getName());

        s1.setName("Alex");
        s1.setYear(4);
        System.out.println(s1.getYear());
        System.out.println(s1.getName());

    }
}
