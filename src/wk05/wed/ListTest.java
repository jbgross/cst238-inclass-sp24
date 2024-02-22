package wk05.wed;

public class ListTest {

    public static void foo(String s) {
        System.out.println("Printing s before: " + s);
        s = s + s;
        System.out.println("Printing s after: " + s);
    }
    public static void main(String[] args) {

        List names = new List();
//        List ids;
        names.append("foo");
        names.append("bar");

        names.append("quux");
        names.append("grault");
        names.append("baz");
        System.out.println(names.firstLetters());
        System.out.println(names.charCount());
        names.delete(3);
        System.out.println(names.charCount());
        System.out.println(names);

        List n2 = names;
        n2.delete(0);
        System.out.println(names);

        String x = "hello";
        System.out.println("Printing x before: " + x);
        foo(x);
        System.out.println("Printing x after: " + x);
        String y = "foo";
        String z = y;
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        y = "bar";
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }
}
