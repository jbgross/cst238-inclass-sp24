package wk07.mon;

public class Foo {
    private int bar;
    private String grault;
    private static int fooCount = 0;

    public Foo() {
        fooCount++;
//        this(5);
        System.out.println("Creating a Foo");
        System.out.println(this);
    }

    public Foo(int bar) {
//         new Foo();
        this();
        this.setBar(bar);
        System.out.println(this);
    }

    public Foo(int bar, String grault) {
        this(bar);
        System.out.println(this);
    }

    public Foo getMe() {
        return this;
    }

    public static int getFooCount() {
        return fooCount;
    }

    public static int getQuux() {
        return 0;
    }

    public void setBar(int bar) {
//        int bar;
        this.bar = bar;
    }

    public int getBar() {
        return this.bar;
    }

    public void setGrault(String grault) {
        this.grault = grault;
        setBar(5);
    }
}
