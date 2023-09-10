package lessons.learn_class.learn_string;

/**
 Имеется строка, к примеру "Hello my young dog".
 Необходимо перевернуть строку в след. формате "godgn uo yymol leH".
 То есть после реверса длина слова равнялась изначальной длине.
 */
public class Task11 {
    public static void main(String[] args) {

        String str = "Don't speak my English";

        String replacedStr = str.replaceAll(" ", "");

        String s = new StringBuilder(replacedStr).reverse().toString();
        String[] words = str.split("#");

        StringBuilder builder = new StringBuilder();

        for (String word : words) {
            int length = word.length() - 1;//5 for 0 iteration1
            String value = s.substring(2, length);//hsilgnEymkaepst'noD

            builder.append(value).append(" ");//"hsilgn "
            s = s.substring(length);//Eymkaepst'noD
        }
        System.out.println(builder);

    }

}

/**
 *
 * 1   5
 * 2   6
 * 3   7
 * 4   8
 */
