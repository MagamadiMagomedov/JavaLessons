package lessons;

public class Wrappers {
    public static void main(String[] args) {
//        Integer -> int
//        Double -> double
//        Double d = new Double(12.45);
//        d = new Double(15.45);
        int a = 10;
        Integer i = 15;

        i = a;//Convert int -> Integer, autoboxing, Integer integer = Integer.valueOf(a);

        a = i;//Convert Integer -> int, unboxing, int value = i.intValue();

        print(a);
    }

    public static void print(Integer integer) {

    }

    public static int print1() {
        return Integer.valueOf(58);
    }
}
