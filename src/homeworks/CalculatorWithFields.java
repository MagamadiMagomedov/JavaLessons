package homeworks;

public class CalculatorWithFields {
    public float value1;
    public float value2;

    public CalculatorWithFields( float newValue1,float newValue2){
        value1 = newValue1;
        value2 = newValue2;

    }
    public void setValue1(float newValue1){
        value1 = newValue1;
    }

    public void setValue2(float newValue2){
        value2 = newValue2;
    }

    public float sum() {
        return value1 + value2;
    }
    public float minus() {
        return value1 - value2;
    }
    public float multiply() {
        return value1 * value2;
    }
}

class testCalc {
    public static void main(String[] args) {
        CalculatorWithFields cwf = new CalculatorWithFields(12, 8);

        float sum = cwf.sum();//20

        System.out.println(sum);

        cwf.setValue1(15);
        cwf.setValue2(10);

        float minus = cwf.minus();

        System.out.println(minus);
    }

}

