/**
 * Created by Domino on 2016-11-20.
 */
public class Powtorzenie {

    /**
     * To jest metoda main.
     * @param args argumenty
     */
    public static void main(String[] args) {
        //to jest komentarz jednoliniowy
        /*

        To jest
        komentarz wieloliniowy
         */

        int liczbaC = 10; //long, short

        double liczbaZm = 2.0; //float

        char znak = 'A';
        System.out.println((int) znak);

        boolean czyPada = false; //true

        //+ - / * %
        System.out.println(5 % 2);
        System.out.println(5 / 2.); // 2.5, 2, 3

        int suma = 10;
        suma += 15;//suma = suma + 15;

        int counter = 1;
        System.out.println(counter++); //postinkrementacja, po wykonaniu counter = 2
        System.out.println(++counter); //preinkrementacja
    }

}
