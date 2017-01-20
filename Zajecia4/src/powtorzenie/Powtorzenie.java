package powtorzenie;

/**
 * Created by Domino on 2016-12-18.
 */
public class Powtorzenie {

    public static void main(String[] args) {
        Person p1 = new Person("Janek", "Kowalski");

        System.out.println(p1);
    }
}


class Person {
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void przedstawSie() {
        System.out.println("Nazywam sie " + name + " " + surname);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}