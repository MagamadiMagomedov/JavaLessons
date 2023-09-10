package lessons.learn_class.learn_string;

/**
 * Implement method hasNoneLetters.
 * Method returns true if none of the letters in the blacklist are present in the phrase.
 * If at least one letter from blacklist is present in the phrase return false.
 */
public class Task3 {
    public static void main(String[] args) {
        String str = "Hello my young friend";

        String bl = "wy";

        boolean result = hasNoneLetters(str, bl);

        System.out.println(result);
    }

    public static boolean hasNoneLetters(String str, String blackList) {

        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);

            String symbolAsString = String.valueOf(symbol);// 'a' -> "a"

            if (blackList.contains(symbolAsString)) {
                return false;
            }
        }

        return true;
    }
}
