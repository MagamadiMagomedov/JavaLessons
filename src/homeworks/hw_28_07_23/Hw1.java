package homeworks.hw_28_07_23;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hw1 {
    public static void main(String[] args) {
         String text = "Hello";
        // String template = "[A-Za-z]*[0-9]{2}";
        // String template = "[A-Za-z]{2}\\d*";

//String text = "Hello1";
//String template = "[0-9]{2,4}[a-z]{2,4}[0-9]{2,4}";

//String name = "Name und Surname";
//String nameTemplate = "[A-Za-z]{50}";

        String nameUpper = "Ivanov Petr";
        String nameTemplateUpper = "[A-Z][a-z]{0,50}\\s[A-Z][a-z]{0,50}";


//boolean symMatch = Pattern.matches(template, text);

//boolean nameMatch = Pattern.matches(nameTemplate, name);

        boolean nameMatchSur = Pattern.matches(nameTemplateUpper, nameUpper);
        boolean nameMatchSur1 = Pattern.matches(nameTemplateUpper, text);

        System.out.println(nameMatchSur);


        Pattern pattern = Pattern.compile(nameTemplateUpper);

        Matcher matcher = pattern.matcher(nameUpper);
        Matcher matcher1 = pattern.matcher(text);

        boolean matches = matcher.matches();

        System.out.println(matches);



    }
}
