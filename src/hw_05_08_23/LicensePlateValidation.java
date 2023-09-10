package hw_05_08_23;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Основная часть государственного номера состоит из 6 символов: 3-х букв и 3 цифр.
   Сначала идет буква, потом 3 цифры и потом еще 2 буквы заканчивают запись.
   Могут использоваться любые цифры от 0 до 9, а в качестве букв лишь следующие символы:
   A,B,C,E,H,K,M,O,P,T,X,Y. К примеру "P204BT" правильный номер,
   а "X182YZ" и "ABC216" - нет. Определить какие из номеров соответствуют принятому стандарту
 */
public class LicensePlateValidation {

    public static void main(String[] args) {
        String[] licensePlates = {"X204BT", "P182YZ", "ABC216"};
        Pattern pattern = Pattern.compile("[A,B,C,E,H,K,M,O,P,T,X,Y]\\d{3}[A|B|C|E|H|K|M|O|P|T|X|Y]{2}");
        for (String plate : licensePlates) {
            Matcher matcher = pattern.matcher(plate);
            if (matcher.matches()) {
                System.out.println(plate + " - Номер соответствует стандарту");
            } else {
                System.out.println(plate + " - Номер не соответствует стандарту");
            }
        }
    }
}

