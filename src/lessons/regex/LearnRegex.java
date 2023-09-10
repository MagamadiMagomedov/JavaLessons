package lessons.regex;

import java.util.regex.Pattern;

public class LearnRegex {
    public static void main(String[] args) {
        /*String text = "Hello";
        String template = "H.llo";//any symbol*/

        /*String text = "Hrllo";
        String template = "H[ae]llo";//or a or e symbols*/

        /*String text = "Hrllo";
        String template = "H[a-r]llo";//from a to r symbols*/

        /*String text = "Hbllo";
        String template = "H[a-r&&[^fd]]llo";//from a to r symbols, exclude f and d symbols*/

        /*String text = "H8llo";
        String template = "H[0-9]llo";//from 0 to 9 symbols*/
/*
        String text = "H8llo";
        String template = "H[0-9]llo";//from 0 to 9 symbols*/

        /*String text = "H8llo";
        String template = "H\\dllo";//from 0 to 9 symbols*/

        /*String text = "H@llo";
        String template = "H\\Wllo";//from 0 to 9 symbols*/

//        Quantors
        /*
        String text = "Haallo";
        String template = "H[ae]{2}llo";//only 2 times*/

        /*String text = "Haallo";
        String template = "H[ae]{2,4}llo";//from 2 to 4 times*/

        /*String text = "Haallo";
        String template = "H[ae]*llo";//any times*/

        /*String text = "Haallo";
        String template = "H[ae]+llo";//from 1 to infinity*/

        String text = "Hello";
        String template = "H[ae]?llo";//or 0 or 1

        boolean isMatch = Pattern.matches(template, text);

        System.out.println(isMatch);
    }
}
