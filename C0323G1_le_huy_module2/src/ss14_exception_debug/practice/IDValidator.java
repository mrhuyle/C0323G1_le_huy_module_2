package ss14_exception_debug.practice;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class IDValidator {
    public static void main(String[] args) {
        String pattern = "^[ST]\\d{3}$";
        String[] ids = {"S001", "T123", "S1234", "X001"};

        // Compile the regular expression pattern
        Pattern regex = Pattern.compile(pattern);

        // Iterate over the IDs and match against the pattern
        for (String id : ids) {
            Matcher matcher = regex.matcher(id);

            // Check if the ID matches the pattern
            if (matcher.matches()) {
                System.out.println(id + " is valid");
            } else {
                System.out.println(id + " is invalid");
            }
        }
    }
}

