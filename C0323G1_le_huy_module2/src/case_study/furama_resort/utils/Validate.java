package case_study.furama_resort.utils;

import java.time.LocalDate;
import java.time.Period;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    public static void main(String[] args) {
        String date = "20-01-01";
        System.out.println(validateAge(date));
    }

    public static final String EMPLOYEE_CODE_REGEX = "^NV-\\d{4}$";
    public static final String EMPLOYEE_NAME_REGEX = "^([A-Z][a-z]+|[A-Z])(\\s[A-Z]|(\\s[A-Z][a-z]+)+)$";
    public static final String DATE_REGEX = "^[1-2][0-9]{3}-(0[1-9]|1[0-2])-(0[1-9]|1[0-9]|2[0-9]|3[1-2])$";
    public static final String ID_REGEX = "^([0-9]{9}||[0-9]{12})$";
    public static final String PHONE_REGEX = "^0\\d{9}$";
    public static final String EMAIL_REGEX = "^\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,3})+$";
    public static final String CUSTOMER_CODE_REGEX = "^KH-\\d{4}$";
    public static final String FACILITY_CODE_REGEX = "^SV(VL|HO|RO)-\\d{4}$";
    public static final String FACILITY_NAME_REGEX = "^(([A-Z])|([A-Z][a-z1-9]*))(\\s([a-z1-9]+))*$";
    public static final String BOOKING_CODE_REGEX = "^BO-\\d{4}$";


    public static boolean validateEmployeeCode(String code) {
        Pattern pattern = Pattern.compile(EMPLOYEE_CODE_REGEX);
        Matcher matcher = pattern.matcher(code);
        boolean result = matcher.matches();
        return result;
    }

    public static boolean validateName(String name) {
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
        int age = Period.between(dob, now).getYears();
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean validateID(String id) {
        Pattern pattern = Pattern.compile(ID_REGEX);
        Matcher matcher = pattern.matcher(id);
        boolean result = matcher.matches();
        return result;
    }

    public static boolean validatePhoneNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher = pattern.matcher(phoneNumber);
        boolean result = matcher.matches();
        return result;
    }

    public static boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        boolean result = matcher.matches();
        return result;
    }

    public static boolean validateCustomerCode(String code) {
        Pattern pattern = Pattern.compile(CUSTOMER_CODE_REGEX);
        Matcher matcher = pattern.matcher(code);
        boolean result = matcher.matches();
        return result;
    }

    public static boolean validateFacilityCode(String code) {
        Pattern pattern = Pattern.compile(FACILITY_CODE_REGEX);
        Matcher matcher = pattern.matcher(code);
        boolean result = matcher.matches();
        return result;
    }

    public static boolean validateFacilityName(String name) {
        Pattern pattern = Pattern.compile(FACILITY_NAME_REGEX);
        Matcher matcher = pattern.matcher(name);
        boolean result = matcher.matches();
        return result;
    }

    public static boolean validateBookingCode(String code) {
        Pattern pattern = Pattern.compile(BOOKING_CODE_REGEX);
        Matcher matcher = pattern.matcher(code);
        boolean result = matcher.matches();
        return result;
    }
}
