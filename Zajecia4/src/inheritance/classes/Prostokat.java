package inheritance.classes;

/**
 * Created by Domino on 2016-12-18.
 */
public class Prostokat extends Kwadrat {
    private int b;

    public Prostokat(String name, int a, int b) {
        super(name, a);
        this.b = b;
    }

    @Override
    public void draw(char ch) {
        for(int i = 0; i < getA(); i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
