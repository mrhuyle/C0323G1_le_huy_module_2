package ss16_io_binary_file_serialization.exercise.product_management.controller;

import ss16_io_binary_file_serialization.exercise.product_management.service._implement.ProductManagementService;
import ss16_io_binary_file_serialization.exercise.product_management.service._interface.IProductMangementService;

import java.util.Scanner;

public class ProductManagementController {
    private static Scanner scanner = new Scanner(System.in);
    private static IProductMangementService productMangementService = new ProductManagementService();

    public static void showMenu() {
        do {
            //Menu information:
            System.out.println("----------------MENU----------------");
            System.out.println("Please choose following options: \n" +
                    "1. Add product\n" +
                    "2. Display products list\n" +
                    "3. Search product\n" +
                    "4. Exit\n" +
                    "Input option: ");

            //Input option:
            int option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    productMangementService.addProduct();
                    break;
                case 2:
                    productMangementService.displayProductList();
                    break;
                case 3:
                    productMangementService.searchProduct();
                    break;
                case 4:
                    System.out.println("***You had exited the program***");
                    System.exit(0);
            }
        } while (true);
    }
}
