package case_study.furama_resort.utils;

import java.time.LocalDate;
import java.time.Period;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    public static void main(String[] args) {
        String date ="20-01-01";
        System.out.println(validateAge(date));
    }
    public static final String EMPLOYEE_CODE_REGEX = "^NV-\\d{4}$";
    public static final String EMPLOYEE_NAME_REGEX = "^([A-Z][a-z]+)(\\s[A-Z]|(\\s[A-Z][a-z]+)+)$";
    public static final String DATE_REGEX = "^[1-2][0-9]{3}-(0[1-9]|1[0-2])-(0[1-9]|1[0-9]|2[0-9]|3[1-2])$";
    public static boolean validateEmployeeCode(String code) {
        Pattern pattern = Pattern.compile(EMPLOYEE_CODE_REGEX);
        Matcher matcher = pattern.matcher(code);
        boolean result = matcher.matches();
        return result;
    }

    public static boolean validateEmployeeName(String name) {
        Pattern pattern = Pattern.compile(EMPLOYEE_NAME_REGEX);
        Matcher matcher = pattern.matcher(name);
        boolean result = matcher.matches();
        return result;
    }

    public static boolean validateDate(String date) {
        Pattern pattern = Pattern.compile(DATE_REGEX);
        Matcher matcher = pattern.matcher(date);
        boolean result = matcher.matches();
        return result;
    }
    public static boolean validateAge(String birthdate) {
        LocalDate dob = LocalDate.parse(birthdate);
        LocalDate now = LocalDate.now();
        int age = Period.between(dob,now).getYears();
        if (age>=18) {
            return true;
        } else {
            return false;
        }
    }
}
