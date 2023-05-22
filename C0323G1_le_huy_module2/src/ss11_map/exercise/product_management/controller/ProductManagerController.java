package ss11_map.exercise.product_management.controller;

import ss11_map.exercise.product_management.service.interface__.IProductManagementService;
import ss11_map.exercise.product_management.service.implement_.ProductManagementService;

import java.util.Scanner;

public class ProductManagerController {
    private static Scanner scanner = new Scanner(System.in);
    private static IProductManagementService productManagementService = new ProductManagementService();

    public static void menu() {
        do {
            System.out.println("**************** GIAO DIỆN ************************");
            System.out.println("Vui lòng chọn chức năng theo số để tiếp tục");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa sản phẩm");
            System.out.println("3. Xoá sản phẩm");
            System.out.println("4. Hiển thị sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm theo tên");
            System.out.println("6. Sắp xếp sản phẩm theo giá");
            System.out.println("0. Thoát");
            System.out.println("Chọn chức năng: ");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 0:
                    System.out.println("Bạn đã chọn thoát chương trình");
                    System.exit(0);
                    break;
                case 1:
                    productManagementService.addProduct();
                    break;
                case 2:
                    productManagementService.editProduct();
                    break;
                case 3:
                    productManagementService.deleteProduct();
                    break;
                case 4:
                    productManagementService.displayAll();
                    break;
                case 5:
                    productManagementService.searchProductName();
                    break;
                case 6:
                    productManagementService.sortProductPrice();
                    break;
            }
        } while (true);
    }
}
