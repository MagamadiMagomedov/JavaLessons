package lessons.conditional_operator;

/**
 * Написать логическое выражение для расчета суммы выплаты по
 * депозиту на вклад : до 5000 грн начисляется 20% годовых, от 5000 грн
 * до 10000 грн -22% годовых.
 */
public class Task1 {
    public static void main(String[] args) {
        int deposit = 5000;

        float result = 0;

        if (deposit <= 5000) {
            result = deposit + deposit * 0.2f;
        } else if (deposit >= 5000 && deposit < 10000) {
            result = deposit + deposit * 0.22f;
        }

        System.out.println(result);
    }
}
