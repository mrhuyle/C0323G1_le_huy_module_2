package case_study.furama_resort.controller;

import case_study.furama_resort.service.implement_.EmployeeService;
import case_study.furama_resort.service.interface_.IEmployeeService;

import java.util.Scanner;

public class EmployeeController {
    private static final Scanner scanner = new Scanner(System.in);
    private static IEmployeeService employeeService = new EmployeeService();

    public static void displayMenu() {
        do {
            try {
                System.out.println("*** Employee Management Menu ***\n" +
                        "1. Display list employees\n" +
                        "2. Add new employee \n" +
                        "3. Edit employee\n" +
                        "4. Return main menu");
                System.out.println("Input option: ");
                int option = Integer.parseInt(scanner.nextLine());
                switch (option) {
                    case 1:
                        employeeService.displayList();
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
            } catch (Exception e) {
                System.err.println("System error");
            }
        } while (true);
    }
}

