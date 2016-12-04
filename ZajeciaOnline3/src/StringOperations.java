/**
 * Created by Domino on 2016-12-04.
 */
public class StringOperations {

    public static void main(String[] args) {
        String str = "Hello world!";

        System.out.println(str);

        System.out.println("Znaki (indeksy) 'a': " + str.indexOf('a'));
        System.out.println(str.substring(5));
        System.out.println(str.substring(2, 6));

        str = str.substring(2, 6);

        System.out.println(str);

    }

}
