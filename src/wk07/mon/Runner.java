package wk07.mon;

public class Runner {
    public static void main(String[] args) {
        String s = "hello";
        int x = Foo.getQuux();
        Foo r = new Foo();
        r.setBar(5);
        new Foo(5, s);
        System.out.println(Foo.getFooCount());
        System.out.println(r.getFooCount());
        System.out.println(r.getMe().getFooCount());
        System.out.println(r.getMe().toString().length());
        Foo b = r.getMe();
        String b2 = b.toString();
        System.out.println(b2.length() );
//        new Foo();
        int q = 4 + 5;

    }
}
