package inheritance.classes;

/**
 * Created by Domino on 2016-12-18.
 */
//jezeli chcemy zablokowac dziedziczenie slowo kluczowe final
public class Figura {
    private String name;

    public Figura() {
    }

    public Figura(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return 0.0;
    }

    public int getPerimeter(){
        return 0;
    }

    public final String getDescription() {
        return "Moja fajna figura z super opisem nazywa sie tak: " + name;
    }

    public void draw(char ch) {
        System.out.println(name);
    }

    protected void przykladProtected() {

    }

    private void przykladPrivate() {

    }


    @Override
    public String toString() {
        return "Figura{" +
                "name='" + name + '\'' +
                '}';
    }
}
