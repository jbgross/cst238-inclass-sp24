package wk08.wed;

import java.util.*;
import java.io.*;
public class Runner {
    public static void main(String[] args) throws IOException {
        ArrayList<String> al = new ArrayList<>();

//        al.add("foo");
//        al.add(0, "bar");
//        //al.
        String filename = "src/wk08/wed/data.txt";
        FileReader fr = new FileReader(filename);
        Scanner fs = new Scanner(fr);

        while(fs.hasNext()) {
            al.add(fs.next());
        }
        fr.close();

        print(al);
        Collections.sort(al);
        print(al);

        Person p1 = new Person("Hector", 25, 72);
        Person p2 = new Person("ariel", 87, 60);
        if(p1.compareTo(p2) < 0) {
            System.out.println(p1 + ", " + p2);
        } else {
            System.out.println(p2 + ", " + p1);
        }
//        System.out.println(p1);
//        System.out.println(p2);
        System.out.println();
        ArrayList<Person> personList = loadPerson("src/wk08/wed/person.txt");
        printPersons(personList);
        Collections.sort(personList);
        printPersons(personList);

    }

    private static void printPersons(ArrayList<Person> personList) {
        for(Person p : personList) {
            System.out.println(p);
        }
        System.out.println();
    }

    public static ArrayList<Person> loadPerson(String filename)
        throws IOException
    {
        FileReader fr = new FileReader(filename);
        Scanner fs = new Scanner(fr);
        ArrayList<Person> people = new ArrayList<>();
        while(fs.hasNext()) {
            Person p = new Person(fs.next(), fs.nextInt(), fs.nextInt());
            people.add(p);
        }
        fr.close();
        return people;
    }

    private static void print(ArrayList<String> al) {
        for(String s : al) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
