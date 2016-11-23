import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Domino on 2016-11-20.
 */
public class ZajeciaOnline2 {

    public static void main(String[] args) {
//        Scanner klawiatura = new Scanner(System.in);
//
//        System.out.println("Jak masz na imie?");
//        System.out.println(klawiatura.nextLine());
//
//        System.out.println("Ile masz lat?");
//        System.out.println(klawiatura.nextInt());

//        String imie = JOptionPane.showInputDialog("Jak masz na imie?");
//        System.out.println(imie);
//
//        int wiek = Integer.parseInt(JOptionPane.showInputDialog("Ile masz lat?"));
//        System.out.println(wiek);

//        int indeks1 = 123;
//        int indeks2 = 321;
//        int indeks3 = 456;
//
//        int[] indeksy = {indeks1, indeks2, indeks3};//new int[3];
//
//        System.out.println(indeksy[indeksy.length - 1]);
//        System.out.println(Arrays.toString(indeksy));
//
//        int[][] multiDimArr = {{1, 2}, {3, 4}};//new int[2][2];
//
//        System.out.println(Arrays.toString(multiDimArr[0]));
//        System.out.println(Arrays.toString(multiDimArr[1]));
//        System.out.println(multiDimArr[0][1]);


//        boolean czyPada = false;
//
//        if (czyPada) {
//            System.out.println(":(");
//        } else {
//            System.out.println("Super! :D");
//        }
//
//        int miesiac = 13;
//
//        if (miesiac == 1) {
//
//        } else if (miesiac == 2) {
//
//        } else if (miesiac == 3) {
//
//        }
//
//        switch (miesiac) {
//            case 1:
//                System.out.println("Styczen");
//                break;
//            case 2:
//                System.out.println("Luty");
//                break;
//            case 3:
//                System.out.println("Marzec");
//                break;
//            default:
//                System.out.println("Nie wiem");
//        }

//        int licznik = 0;
//        while (licznik < 10) {
//            System.out.println("iteracja: " + licznik);
//            licznik++;
//        }
//
//        System.out.println();
//
//        licznik = 0;
//        do {
//            System.out.println("iteracja: " + licznik);
//            licznik++;
//        } while (licznik < 10);

//        for (int i = 0; i < 10; i++) { // (przed wejsciem; warunek wyjscia; po kazdej iteracji)
//            System.out.println("iteracja: " + i);
//        }

        int[] array = {1, 2, 4, 10};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        for (int element : array) {
            System.out.println(element);
        }

        int[][] arrayMulti = {{1, 2}, {3, 4}};

        for (int[] row : arrayMulti) {
            System.out.println(Arrays.toString(row));
        }

    }

}
