package oop;

/**
 * Created by Domino on 2016-12-04.
 */
public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Ala", "ma kota");
        person1.sayHello();
        person1.sayHello("puszek");

        Person person2 = new Person("Janek", "Kowalski");
        person2.sayHello();
        person2.sayHello("Ala");

        System.out.println(person1.getId());
        System.out.println(person2.getId());

        // Wielkie be: person1.sayHello("", "");

        Person.sayHello("Ala", "Janek");

        System.out.println(Math.pow(2, 4)); //przyklad statycznej metody
    }

}
