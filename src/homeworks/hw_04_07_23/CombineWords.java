package homeworks.hw_04_07_23;

public class CombineWords {
    public static void main(String[] args) {
        String word1 = "one";
        String word2 = "eight";

        word2 = word1.concat(word2);

        String combinedWord = combineWords(word1, word2);
        System.out.println(combinedWord);

    }

    public static String combineWords(String word1, String word2) {
        if (word1.charAt(word1.length() - 1) == word2.charAt(0)) {
            return word1.concat(word2.substring(1));
        } else {
            return word1.concat(word2);
        }
    }

    public static String combineWords1(String word1, String word2) {
        String result = word1.charAt(word1.length() - 1) == word2.charAt(0) ?
                word2.substring(1) :
                word2;
        return word1.concat(result);
    }

    public static String combineWords2(String word1, String word2) {
        word2 = word1.charAt(word1.length() - 1) == word2.charAt(0) ?
                word2.substring(1) :
                word2;
        return word1.concat(word2);
    }
}

