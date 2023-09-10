package lessons;

public class Variables {
    public static void main(String[] args) {
        byte b = 12;

        byte b1 = b;

        byte b2 = (byte)(b + 1);//13, byte(8) + int(32) = 32, downcasting

        int a = (int)b;//upcasting

        long l = 12L;

        float f = 12.45F;

        double d = 78.89;

        boolean bool = false;

        char ch = 'D';

        char ch1 = '\u0520';

    }
}
