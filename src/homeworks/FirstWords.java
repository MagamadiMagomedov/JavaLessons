package homeworks;

public class FirstWords {
    public static void main(String[] args) {
        String word1 = "apple";
        String word2 = "banana";

        String firstWord = word1.substring(1);
        String secondWord = word2.substring(1);

        String result = firstWord + secondWord;

        System.out.println(result);
    }
}