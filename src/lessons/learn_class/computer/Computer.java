package lessons.learn_class.computer;

/**
 * 1) Write Computer class, the attributes of this class
 * serialNumber (of int type), price (of float type),
 * quantityCPU (of int type) and frequencyCPU (of int type).
 * <p>
 * 2) The fields Computer class need to be encapsulated.
 * Use correct access modifiers.
 * 3) Write a program to create array of Computer objects (5 pcs.).
 * Declare array of Computer objects (5 pcs.), create 5 Computer objects and place it to array.
 * 4) Write a program that iterate through array of Computer objects and increases by 10 percent field price.
 * 5) Add to class Computer method void view(){} that prints all fields of object in line.
 * Print all info (fields) of all objects in console.
 */
public class Computer {
    private int serialNumber;
    private float price;
    private int quantityCPU;
    private int frequencyCPU;

    public Computer(int serialNumber, float price, int quantityCPU, int frequencyCPU) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.quantityCPU = quantityCPU;
        this.frequencyCPU = frequencyCPU;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void view() {
        System.out.println("Serial number = " + serialNumber + "\tPrice = " + price);
    }
}

class TestComputer {
    public static void main(String[] args) {
//        datatype[] name = new datatype[size];

        Computer[] computers = new Computer[5];//null

        Computer computer1 = new Computer(123, 12.45f, 5, 3200);
        Computer computer2 = new Computer(245, 14.45f, 7, 3400);
        Computer computer3 = new Computer(548, 23.75f, 9, 3700);

        computers[0] = computer1;
        computers[1] = computer2;
        computers[2] = computer3;

        int a = 0;

//        a = 15;

        Computer computer4 = null;

//        computer4.setPrice(12);

//        computer2 = new Computer(123, 12.45f, 5, 3200);

        for (Computer computer : computers) {//3 non nulls, 2 nulls
            if (computer != null) {
                float price = computer.getPrice();

                price += price * 0.1f;
//                price = price + price * 0.1f;

                computer.setPrice(price);

                computer.view();
            }
        }

    }
}

