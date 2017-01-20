package inheritance.classes;

/**
 * Created by Domino on 2016-12-18.
 */
public class Kwadrat extends Figura {
    private int a;

    public Kwadrat(String name, int a) {
        super(name);
        this.a = a;
    }

    @Override
    public void draw(char ch) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public double getArea() {
        return a * a;
    }

    @Override
    public int getPerimeter() {
        przykladProtected();
//        przykladPrivate(); - nie dostepne
        return 4 * a;
    }

    @Override
    public String toString() {
        return super.toString() + " Kwadrat{" +
                "a=" + a +
                '}';
    }
}
