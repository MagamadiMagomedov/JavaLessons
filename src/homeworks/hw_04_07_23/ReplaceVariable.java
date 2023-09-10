package homeworks.hw_04_07_23;

public class ReplaceVariable {
    public static void main(String[] args) {
         int a = 5;
         int b = 7;

         //a = 7, b = 5

        /*int c = a;
        a = b;
        b = c;*/

        b = b + a;//7 + 5

        a = b - a;//7

        b = b - a;//5
    }
}
