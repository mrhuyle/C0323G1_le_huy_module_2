package case_study.furama_resort.controller;

import case_study.furama_resort.service.implement_.FacilityService;
import case_study.furama_resort.service.interface_.IFacilityService;

import java.util.Scanner;

public class FacilityController {
    private static final Scanner scanner = new Scanner(System.in);
    private static IFacilityService facilityService = new FacilityService();

    public static void displayMenu() {
        do {
            try {
                System.out.println("*** Facility Management Menu ***\n" +
                        "1. Display list facility\n" +
                        "2. Add new facility \n" +
                        "3. Edit facility\n" +
                        "4. Return main menu");
                System.out.println("Input option: ");
                int option = Integer.parseInt(scanner.nextLine());
                switch (option) {
                    case 1:
                        facilityService.displayList();
                        break;
                    case 2:
                        displaySubMenu();
                        break;
                    case 3:
                        break;
                    case 4:
                        MainMenuController.displayMainMenu();
                        break;
                }
            } catch (NumberFormatException e) {
                System.err.println("Error. Invalid option. Option must be 1-4");
                e.printStackTrace();
            } catch (Exception e) {
                System.err.println("System error");
            }
        } while (true);
    }

    public static void displaySubMenu() {
        do {
            try {
                System.out.println("*** Facility Sub Menu ****\n" +
                        "1. Add New Villa\n" +
                        "2. Add New House\n" +
                        "3. Add New Room\n" +
                        "4. Back to menu");
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
                        displayMenu();
                        break;
                    default:
                        throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                System.err.println("Error.Invalid option. Option must be 1 - 4");
            } catch (Exception e) {
                System.err.println("System error");
            }
        } while (true);
    }
}
