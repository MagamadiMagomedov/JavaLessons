package lessons.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UseMatcher {
    public static void main(String[] args) {
        String str = "Hello 15 friend 7 hello 19 world 6";//27

        Pattern pattern = Pattern.compile("\\d{1,2}");

        Matcher matcher = pattern.matcher(str);

        int sum = 0;

        while (matcher.find()) {
            String digit = matcher.group();

            int value = Integer.parseInt(digit);//Convert from String to int

            sum += value;
        }

        System.out.println(sum);
    }
}
