package homeworks;

public class EmailTask2 {
    public static void main(String[] args) {
        String email = "craig_federighi@apple.com";
        String[] emailParts = email.split("@");
        String[] nameParts = emailParts[0].split("_");

        char firstNameFirstChar = nameParts[0].charAt(0);
        String firstNameFirstCharAsString = String.valueOf(firstNameFirstChar);
        String upperCaseFirstName = firstNameFirstCharAsString.toUpperCase();
        String firstNameRestPart = nameParts[0].substring(1);
        String firstName = upperCaseFirstName.concat(firstNameRestPart);

        char lastNameFirstChar = nameParts[1].charAt(0);
        String lastNameFirstCharAsString = String.valueOf(lastNameFirstChar);
        String upperCaseLastNameFirstChar = lastNameFirstCharAsString.toUpperCase();
        String lastNameRestPart = nameParts[1].substring(1);
        String lastName = upperCaseLastNameFirstChar.concat(lastNameRestPart);

        String domain = emailParts[1];

        System.out.println("Имя: " + firstName);
        System.out.println("Фамилия: " + lastName);
        System.out.println("Домен: " + domain);
    }
}

