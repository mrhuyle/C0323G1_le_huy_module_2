package case_study.furama_resort.controller;

import java.util.Scanner;

public class FuramaController {
    private static final Scanner scanner = new Scanner(System.in);
    public static void displayMainMenu() {
        do {
            try {
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
                        EmployeeController.displayMenu();
                        break;
                    case 2:
                        CustomerController.displayMenu();
                        break;
                    case 3:
                        FacilityController.displayMenu();
                        break;
                    case 4:
                        BookingController.displayMenu();
                        break;
                    case 5:
                        PromotionController.displayMenu();
                        break;
                    case 6:
                        System.exit(0);
                    default:
                        throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                System.err.println("Error. Invalid option. Option must be 1-6");
            }

        } while (true);
    }
}
