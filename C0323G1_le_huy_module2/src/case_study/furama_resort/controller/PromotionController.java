package case_study.furama_resort.controller;

import java.util.Scanner;

public class PromotionController {
    private static final Scanner scanner = new Scanner(System.in);

    public static void displayMenu() {
        do {
            try {
                System.out.println("*** Promotion Management Menu ***\n" +
                        "1. Display list customers use service\n" +
                        "2. Display list customers get voucher \n" +
                        "3. Return main menu");
                System.out.println("Input option: ");
                int option = Integer.parseInt(scanner.nextLine());
                switch (option) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                }
            } catch (NumberFormatException e) {
                System.err.println("Error. Invalid option. Option must be 1-3");
            }
        } while (true);
    }
}
