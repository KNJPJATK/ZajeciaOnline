import java.util.Scanner;

/**
 * Created by Domino on 2016-12-04.
 */
public class Funkcji {

    public static void main(String[] args) {
        int sumOfThree = inputSumOfThree();
        System.out.println("sumOfThree = " + sumOfThree);

        showMatrix(5);
        showMatrix(7);
    }

    public static int inputSumOfThree() {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

//        scanner.close();

        return a + b + c;
    }

    /**
     * Show matrix on sout.
     *
     * @param length length of matrix
     */
    public static void showMatrix(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}
