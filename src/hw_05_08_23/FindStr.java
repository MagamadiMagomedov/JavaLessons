package hw_05_08_23;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// В строке "Hello str my str friend str world" посчитать сколько встречается str

public class FindStr {
    public static void main(String[] args) {
        String line = "Hello str my str friend str world";
        Pattern pattern = Pattern.compile("str");
        Matcher matcher = pattern.matcher(line);

        int count = 0;

        while (matcher.find()) {
            count++;
        }

        System.out.println("Количество вхождений 'str': " + count);
    }
}
