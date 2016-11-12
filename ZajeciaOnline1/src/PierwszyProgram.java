/**
 * Created by Domino on 2016-11-06.
 */
public class PierwszyProgram {

    // to jest moja metoda main
    /*
    * Wieloliniowy
    * */

    /**
     * To moja metoda main.<br>
     * asds
     * @param args args
     * */
    public static void main(String[] args) {
        System.out.print("\"Hello\tworld!\"\n");

        int liczbaMalp = 78; //short, byte, long
        System.out.println("Liczba malp: " + liczbaMalp + 2);

        double liczbaMalpDouble = 3.5; //float
        boolean czyPada = true; //false
        char znak = 65; //typ znakowy - calkowity

        System.out.println(znak);

        String napis = "Moj super napis :D";

        //dodawanie, pierwiastek, potegowanie,

        int suma = 1 + 3;
        int roznica = 9 - 5;
        int iloczyn = 4 * 5;
        int iloraz = 9 / 2;

        System.out.println("suma=" + suma); //4
        System.out.println("roznica=" + roznica); //4
        System.out.println("iloczyn=" + iloczyn);//20
        System.out.println("iloraz=" + iloraz);//4

        int suma1 = 1 + 3;
        int roznica1 = 9 - 5;
        int iloczyn1 = 4 * 5;
        double iloraz1 = 9 / 2.; //blad, 4.5, String, 4.0

        System.out.println("==================");
        System.out.println("suma=" + suma1); //4
        System.out.println("roznica=" + roznica1); //4
        System.out.println("iloczyn=" + iloczyn1);//20
        System.out.println("iloraz=" + iloraz1);//4

        int modulo = 5 % 2; // reszta z dzielenia (4 + 1) / 2
        System.out.println("\n" + modulo);

        System.out.println(2.0 - 1.1);
    }
}
