package ss17_string_regex.exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    private static final String CLASSNAME_REGEX = "^[CAP][0-9]{4}[GHIK]$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input ClassName: ");
        String className = scanner.nextLine();
        boolean checkValidate = validateClassName(className);
        System.out.println("ClassName: " + className + ", validate: " + checkValidate);
    }

    public static boolean validateClassName(String className) {
        Pattern pattern = Pattern.compile(CLASSNAME_REGEX);
        Matcher matcher = pattern.matcher(className);
        return matcher.matches();
    }
}
