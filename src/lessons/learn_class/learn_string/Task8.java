package lessons.learn_class.learn_string;

/**
 Преобразовать данный текст, заменив каждую строку вида переменная=переменная+1; на строку вида переменная++; а каждую строку вида
 переменная=переменная–1;на строку вида переменная–– .
 */
public class Task8 {
    public static void main(String[] args) {
        String domain = "Hello value=value+1; world result=result-1;";//"Hello value++; world result--;"

        String result = domain
                .replaceAll("value=value\\+1", "value++")
                .replaceAll("result=result-1", "value--");

        System.out.println(result);

    }

}
