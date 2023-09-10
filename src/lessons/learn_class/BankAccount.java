package lessons.learn_class;

/**
 * Создать класс Банковский счет.
 * Установить изначально сумму для счета - 200$
 * Создать метод, который будет отнимать от счета сумму. Если денег недостаточно, тогда написать в консоль - "Пополните счет".
 * Счет можно пополнить другим методом.
 */
public class BankAccount {
    private float sum;

    public BankAccount() {
        sum = 200;
    }

    public void addSum(float value) {
        if (value <= 0) {
            System.out.println("Negative value or zero");
        } else {
            sum += value;
//            sum = sum + value;
        }
    }

    public void withdrawal(float value) {
        if (value <= 0) {
            System.out.println("Negative value or zero");
        } else if(value > sum) {
            System.out.println("Value > sum");
        } else {
            sum -= value;
        }

    }

    public void printBalance() {
        System.out.println("Sum = " + sum);
    }
}

class TestBank {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();//200
        BankAccount account2 = new BankAccount();//200

        account1.addSum(500);

        account1.printBalance();

        account1.withdrawal(800);

        account1.printBalance();

//        account2.printBalance();
    }
}
