package homeworks.hw_21_07_23;

public class TwoVariables {
    public static void main(String[] args) {

        String myStr1 = "Cartoon".toLowerCase();
        String myStr2 = "Tomcat".toLowerCase();

        printUniqueLetters1(myStr1, myStr2);
    }

    public static void printUniqueLetters(String str1, String str2) {
        for (char ch : str1.toCharArray()) {
            if (str2.indexOf(ch) == -1) {
                System.out.print(ch);
            }
        }
    }
    public static void printUniqueLetters1(String str1, String str2) {
        for (char ch : str1.toCharArray()) {

            String symbolAsString = String.valueOf(ch);

            if (!str2.contains(symbolAsString)) {
//            if (str2.contains(symbolAsString) == false) {
                System.out.print(ch);
            }
        }
    }
}
