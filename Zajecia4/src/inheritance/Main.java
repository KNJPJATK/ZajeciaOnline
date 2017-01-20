package inheritance;

import inheritance.classes.Figura;
import inheritance.classes.Kwadrat;
import inheritance.classes.Prostokat;

/**
 * Created by Domino on 2016-12-18.
 */
public class Main {
    public static void main(String[] args) {
        Figura fig1 = new Figura("Moja figura 1");
        Kwadrat kw1 = new Kwadrat("Kwadracik", 10);

        System.out.println(fig1);
        System.out.println(kw1);

        System.out.println("Field of fig1 = " + fig1.getArea());
        System.out.println("Perimeter of fig1 = " + fig1.getPerimeter());

        System.out.println("Field of kw1 = " + kw1.getArea());
        System.out.println("Perimeter of kw1 = " + kw1.getPerimeter());

//        fig1.draw('x');
//        kw1.draw('x');

//        Figura fig2 = new Kwadrat("Kwadrat2", 4);
//        fig2.draw('a');

        Figura[] figures = new Figura[3];
        figures[0] = new Kwadrat("Kwadrat 1", 4);
        figures[1] = new Prostokat("Prostokat 1", 2, 5);
        figures[2] = new Figura("Figura 1");

        char[] chars = {'a', 'x', '*'};

        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i].getClass().getSimpleName());
            figures[i].draw(chars[i]);
        }


//        Kwadrat kw = new Figura("ala");
    }
}
