import javax.swing.*;
import java.util.Scanner;

/**
 * Created by Domino on 2016-12-04.
 */
public class Powtorzenie {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println(scanner.nextLine());
//
//        String userInput = JOptionPane.showInputDialog("Podaj imie");
//
//        System.out.println("twoje imie: " + userInput);

        int[] array1 = {1, 2, 3, 4};
        int[] array2 = new int[4];
        int[] array3 = new int[]{1, 2};

        for (int i = 0; i < array1.length; i++) {
            System.out.println("array1[" + i + "] = " + array1[i]);
        }

        for (int elem : array2) {
            System.out.println("elem = " + elem);
        }

        int i = 0;
        while (i < array3.length) {
            System.out.println("array3[" + i + "] = " + array3[i]);

            i++;
        }
    }

}
