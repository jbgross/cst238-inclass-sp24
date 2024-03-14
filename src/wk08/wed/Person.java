package wk08.wed;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private int heightInInches;

    public Person(String name, int age, int heightInInches) {
        this.name = name;
        this.age = age;
        this.heightInInches = heightInInches;
    }

    public int compareTo(Person p) {
        return this.name.compareToIgnoreCase(p.name);
//        return this.heightInInches - p.heightInInches;
//        return p.age - this.age;
//        if(this.age < p.age) {
//            return -1;
//        } else if(this.age > p.age) {
//            return 1;
//        } else {
//            return 0;
//        }
    }

    public String toString() {
        return "Name: " + this.name + " - Age: " + this.age
                + " - Height: " + this.heightInInches + "\"";
    }
}
