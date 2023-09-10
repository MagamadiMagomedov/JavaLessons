package lessons.learn_class.learn_string;

/**
 * String str = "hello";
 * String str = "Hello";
 */
public class Task5 {
    public static void main(String[] args) {
        String str = "hello";

        char firstSymbol = str.charAt(0);//'h'

        String firstSymbolAsString = String.valueOf(firstSymbol);//'h' -> "h", char -> String

        String upperCaseFirstSymbol = firstSymbolAsString.toUpperCase();//"h" -> "H"

        String lastPartWord = str.substring(1);//"ello"

        String result = upperCaseFirstSymbol.concat(lastPartWord);//"H" + "ello"

        if (1 == 1) {
            int a = 15;
            System.out.println();
        }

        System.out.println(result);

        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }

    }

}
