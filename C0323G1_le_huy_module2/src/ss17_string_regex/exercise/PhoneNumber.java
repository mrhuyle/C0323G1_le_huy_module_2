package ss17_string_regex.exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    private static final String PHONE_NUMBER_REGEX = "^\\(084\\)-\\(\\d{9}\\)$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Phone Number: example (084)-(123456789) ");
        String phoneNumber = scanner.nextLine();
        boolean checkPhoneNumber = validatePhoneNumber(phoneNumber);
        System.out.println("Phone Number: " + phoneNumber + ", validate: " + checkPhoneNumber);
    }
    public static boolean validatePhoneNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile(PHONE_NUMBER_REGEX);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
}
