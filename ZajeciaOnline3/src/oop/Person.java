package oop;

/**
 * Created by Domino on 2016-12-04.
 */
public class Person {
    private static final String ID_PREFIX = "ID";
    private static int personCounter = 1;

    private String name;
    private String surname;
    private String id;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.id = ID_PREFIX + personCounter++;
    }

    void sayHello() {
        System.out.println("Hello from " + name + " " + surname);
    }

    public void sayHello(String toWhom) {
        System.out.println("Hello from " + name + " " + surname + " to " + toWhom);
    }

    public static void sayHello(String from, String to) {
//        name = "abc"; nie moge bo nie jest static

        System.out.println("Hello from " + from + " to " + to);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getId() {
        return id;
    }


}
