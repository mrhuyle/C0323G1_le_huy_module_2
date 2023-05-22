package case_study.furama_resort.controller;

import java.util.Scanner;

public class FuramaController {
    private static Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu() {
        System.out.println("*** This is the main menu. Please choose one of the options below: ***\n" +
                "1. Employee Management\n" +
                "2. Customer Management\n" +
                "3. Facility Management\n" +
                "4. Booking Management\n" +
                "5. Promotion Management\n" +
                "6. Exit");
    }
}
