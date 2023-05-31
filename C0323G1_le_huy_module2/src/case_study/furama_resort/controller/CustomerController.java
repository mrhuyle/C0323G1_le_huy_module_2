package case_study.furama_resort.controller;

import java.util.Scanner;

public class CustomerController {
    private static final Scanner scanner = new Scanner(System.in);
    public static void displayMenu () {
        do {
            try {
                System.out.println("*** Customer Management Menu ***\n" +
                        "1. Display list customers\n" +
                        "2. Add new customer \n" +
                        "3. Edit customer\n" +
                        "4. Return main menu");
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
                    default:
                        throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                System.err.println("Error. Invalid option. Option must be 1-4");
            }
        } while (true);

    }
}

