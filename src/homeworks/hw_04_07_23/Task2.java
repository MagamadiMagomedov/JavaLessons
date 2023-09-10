package homeworks.hw_04_07_23;

public class Task2 {
    public static void main(String[] args) {
        String str = "Hellomyfriend";

        String firstSymbols = str.substring(0, 3);
        int index = str.length() - 3;
        String lastSymbols = str.substring(index);
        String middleStr = str.substring(3, index);

        String result = lastSymbols.concat(middleStr).concat(firstSymbols);
        System.out.println(result);
    }
}
