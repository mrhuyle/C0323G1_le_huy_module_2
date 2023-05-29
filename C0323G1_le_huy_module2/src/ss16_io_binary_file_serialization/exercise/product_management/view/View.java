package ss16_io_binary_file_serialization.exercise.product_management.view;

import ss16_io_binary_file_serialization.exercise.product_management.controller.ProductManagementController;

public class View {
    public static void main(String[] args) {
        System.out.println("-------------PRODUCT MANAGEMENT-------------");
        System.out.println("*********************************************");
        ProductManagementController.showMenu();
    }
}
