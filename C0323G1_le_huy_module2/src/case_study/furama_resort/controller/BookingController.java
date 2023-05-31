package case_study.furama_resort.controller;

import java.util.Scanner;

public class BookingController {
    private static final Scanner scanner = new Scanner(System.in);

    public static void displayMenu() {
        do {
            try {
                System.out.println("*** Booking Management Menu ***\n" +
                        "1. Add new booking\n" +
                        "2. Display list booking \n" +
                        "3. Create new contract\n" +
                        "4. Display list contracts\n" +
                        "5. Edit contracts\n" +
                        "6. Return to main menu");
                System.out.println("Input option: ");
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
                        break;
                    default:
                        throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                System.err.println("Error. Invalid option. Option must be 1-6");
            } catch (Exception e) {
                System.err.println("System error");
            }
        } while (true);
    }
}
