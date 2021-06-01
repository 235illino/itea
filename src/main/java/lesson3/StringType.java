package lesson3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringType {
    public static void main(String[] args) {
        String firstName = "vasya";
        String secondName = "petrenko";

        String fullName = createFullName(firstName, secondName);
        String userID = generateUID(firstName, secondName);
        System.out.println(fullName);
        System.out.println(userID);
        System.out.println(ifContainsNumbers(userID));
    }

    public static String createFullName(String firstName, String lastName) {
        return firstName.toUpperCase() + " " + lastName.toUpperCase();
    }

    public static String generateUID(String firstName, String lastName) {
        int length = firstName.length() + lastName.length();
        String result = firstName.toUpperCase() + "_" + lastName.toUpperCase() + "_";
        return result + length;
    }

    public static boolean ifContainsNumbers(String str){
        return str.matches("(.*)\\d(.*)");
    }
}
