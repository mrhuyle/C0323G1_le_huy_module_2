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
                        "3. Display list facility maintainance\n" +
                        "4. Delete facility\n" +
                        "5. Return main menu");
                System.out.println("Input option: ");
                int option = Integer.parseInt(scanner.nextLine());
                switch (option) {
                    case 1:
                        facilityService.displayList();
                        break;
                    case 2:
                        facilityService.add();
                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    case 5:
                        MainMenuController.displayMainMenu();
                        break;
                }
            } catch (NumberFormatException e) {
                System.err.println("Error. Invalid option. Option must be 1-5");
                e.printStackTrace();
            } catch (Exception e) {
                System.err.println("System error");
            }
        } while (true);
    }
}
