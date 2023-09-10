package homeworks.hw_04_07_23;

class WordsCount {
    public static void main(String[] args) {
        String[] array = {"Hello", "world", "from", "array"};
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                count += array[i].length();
            }
        }

        for (int i = 0; i < array.length; i += 2) {
                count += array[i].length();

        }

        System.out.println("Количество символов: " + count);
    }
}



class WordsModifi {
    public static void main(String[] args) {
        String word = "Thebigword";

        int length = word.length();
        int halfLength = length / 2;

        String Half = word.substring(0, halfLength);
        System.out.println(Half);

        String modifiedHalf = Half.substring(1);
        System.out.println(modifiedHalf);

        int index = word.indexOf("h");
        System.out.println("Позиция символа h: " + index);
    }
}