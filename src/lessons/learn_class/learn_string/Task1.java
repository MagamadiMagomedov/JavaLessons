package lessons.learn_class.learn_string;

/**
 * Вывести текст, составленный из последних букв всех слов., split, charAt
 */
public class Task1 {
    public static void main(String[] args) {
        String sentence = "Hello my young friend";

        String[] words = sentence.split(" ");

        for (String word : words) {
            char lastSymbol = word.charAt(word.length() - 1);

            System.out.println(lastSymbol);
        }
    }
}
