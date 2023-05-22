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
        System.out.println("Input option: ");
        int option = Integer.parseInt(scanner.nextLine());
        switch (option) {
            case 1:
                displayEmployeeManagementMenu();
                break;
            case 2:
                displayCustomerManagementMenu();
                break;
            case 3:
                displayFacilityManagementMenu();
                break;
            case 4:
                displayBookingManagementMenu();
                break;
            case 5:
                displayPromotionManagementMenu();
                break;
            case 6:
                System.exit(0);
                break;
        }
    }

    public static void displayEmployeeManagementMenu() {
        System.out.println("*** Employee Management Menu ***\n" +
                "1. Display list employees\n" +
                "2. Add new employee \n" +
                "3. Edit employee\n" +
                "4. Return main menu");
        int option = Integer.parseInt(scanner.nextLine());
        switch (option) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                displayMainMenu();
                break;
        }
    }

    public static void displayCustomerManagementMenu() {
        System.out.println("*** Customer Management Menu ***\n" +
                "1. Display list customers\n" +
                "2. Add new customer \n" +
                "3. Edit customer\n" +
                "4. Return main menu");
        int option = Integer.parseInt(scanner.nextLine());
        switch (option) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                displayMainMenu();
                break;
        }
    }

    public static void displayFacilityManagementMenu() {
        System.out.println("*** Facility Management Menu ***\n" +
                "1. Display list facility\n" +
                "2. Add new facility \n" +
                "3. Edit facility\n" +
                "4. Return main menu");
        int option = Integer.parseInt(scanner.nextLine());
        switch (option) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                displayMainMenu();
                break;
        }
    }

    public static void displayBookingManagementMenu() {
        System.out.println("*** Booking Management Menu ***\n" +
                "1. Add new booking\n" +
                "2. Display list booking \n" +
                "3. Create new contract\n" +
                "4. Display list contracts\n" +
                "5. Edit contracts\n" +
                "6. Return to main menu");
        int option = Integer.parseInt(scanner.nextLine());
        switch (option) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                displayMainMenu();
                break;
        }
    }

    public static void displayPromotionManagementMenu() {
        System.out.println("*** Promotion Management Menu ***\n" +
                "1. Display list customers use service\n" +
                "2. Display list customers get voucher \n" +
                "3. Return main menu");
        int option = Integer.parseInt(scanner.nextLine());
        switch (option) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                displayMainMenu();
                break;
        }
    }
}
