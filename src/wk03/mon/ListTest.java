package wk03.mon;

public class ListTest {
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
    }
}
