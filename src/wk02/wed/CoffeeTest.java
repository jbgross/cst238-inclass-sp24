package wk02.wed;

public class CoffeeTest {
    public static void main(String[] args) {
        Coffee c1 = new Coffee(15);
        c1.addSyrup("ranch");
        Coffee c2 = new Coffee();

        c1.addSyrup("strawberry");
        c1.addSyrup("vanilla");
        c1.addSyrup("caramel");

        String [] s = c1.getSyrups();
        s[0] = "mint";
        System.out.println(c1);
        System.out.println("c2: " + c2);
    }
}
