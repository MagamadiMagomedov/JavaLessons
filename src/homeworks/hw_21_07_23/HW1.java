package homeworks.hw_21_07_23;

public class HW1 {
    public static void main(String[] args) {

        String str = "Don't speak my English";

        String replacedStr = str.replaceAll(" ", "");

        String s = new StringBuilder(replacedStr).reverse().toString();
        String[] words = str.split(" ");

        StringBuilder builder = new StringBuilder();

        for (String word : words) {
            int length = word.length();
            String value = s.substring(0, length);//hsilgnEymkaepst'noD

            builder.append(value).append(" ");
            s = s.substring(length);
        }

        System.out.println(builder);

    }
 }

/**
 * iter0: hsilgnEymkaepst'noD, hsilgn append
 */