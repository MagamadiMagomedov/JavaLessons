package lessons.learn_class.learn_string;

/**
 Create a class calledEmailTask1.
 Assume that email address is constructed by person's first name and followed by an underscore and last name.

 Write a program that can swap first name with last name in the email (Saperated by an underscore).
 If the email doesn't contain an underscore print the given input email.

 Ex:
 input: mike_tyson@gmail.com
 output: tyson_mike@gmail.com

 */
public class Task4 {
    public static void main(String[] args) {
        String email = "mike_tyson@gmail.com";

        String[] words1 = email.split("@");//[0] - mike_tyson, [1] - gmail.com

        String[] words2 = words1[0].split("_");//[0] - mike, [1] - tyson

        String result =
                words2[1]//tyson
                .concat("_")//tyson_
                .concat(words2[0])//tyson_mike
                .concat("@")//tyson_mike@
                .concat(words1[1]);//tyson_mike@gamil.com

        System.out.println(result);
    }

}
