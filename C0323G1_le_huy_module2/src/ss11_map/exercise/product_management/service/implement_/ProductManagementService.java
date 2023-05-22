package ss11_map.exercise.product_management.service.implement_;

import ss11_map.exercise.product_management.controller.ProductManagerController;
import ss11_map.exercise.product_management.model.Product;
import ss11_map.exercise.product_management.repository.implement_.ProductManagementRepository;
import ss11_map.exercise.product_management.repository.interface_.IProductManagementRepository;
import ss11_map.exercise.product_management.service.interface__.IProductManagementService;

import java.util.List;
import java.util.Scanner;

public class ProductManagementService implements IProductManagementService {
    private static IProductManagementRepository productManagementRepository = new ProductManagementRepository();
    private static Scanner scanner = new Scanner(System.in);
    private static List<Product> productList;

    @Override
    public void displayAll() {
        productList = productManagementRepository.getAll();
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void addProduct() {
        System.out.println("Nhập mã sản phẩm: ");
        String id = scanner.nextLine();
        System.out.println("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số lượng sản phẩm: ");
        int quantity = Integer.parseInt(scanner.nextLine());
        Product newProduct = new Product(id, name, price, quantity);
        System.out.println("Bạn có muốn nhập sản phẩm có thông tin: " + newProduct);
        System.out.println("1. Có || 2. Không");
        int option = Integer.parseInt(scanner.nextLine());
        if (option == 1) {
            System.out.println("Bạn đã nhập thành công sản phẩm");
            productList.add(newProduct);
        }
    }

    @Override
    public void deleteProduct() {
        System.out.println("Nhập mã sản phẩm cần xoá: ");
        String id = scanner.nextLine();
        Product product = productManagementRepository.getProductById(id);
        System.out.println("Bạn có muốn xoá sản phẩm có ID: " + id);
        System.out.println("1. Có || 2. Không");
        int option = Integer.parseInt(scanner.nextLine());
        if (option == 1) {
            System.out.println("Bạn đã xoá thành công sản phẩm có ID: " + id);
            productManagementRepository.deleteProduct(product);
        } else {
            System.out.println("Bạn đã chọn Khônng xoá sản phẩm");
        }
    }

    @Override
    public void editProduct() {
        System.out.println("Nhập mã sản phẩm cần sửa: ");
        String id = scanner.nextLine();
        Product product = productManagementRepository.getProductById(id);
        do {
            System.out.println("********************************************************************************");
            System.out.println("Sản phẩm bạn cần sửa có thông tin là: " + product.toString());
            System.out.println("Bạn cần sửa nội dung nào: 1. ID || 2. Tên || 3. Giá || 4. Số lượng || 0. Thoát");
            System.out.println("Chọn nội dung: ");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    System.out.println("Nhập ID mới: ");
                    String newId = scanner.nextLine();
                    System.out.println("Bạn đã sửa thành công mã sản phẩm mới là: " + newId);
                    product.setId(newId);
                    break;
                case 2:
                    System.out.println("Nhập tên sản phẩm mới: ");
                    String newName = scanner.nextLine();
                    System.out.println("Bạn đã sửa thành công tên sản phẩm mới là: " + newName);
                    product.setName(newName);
                    break;
                case 3:
                    System.out.println("Nhập giá sản phẩm mới: ");
                    int newPrice = Integer.parseInt(scanner.nextLine());
                    System.out.println("Bạn đã sửa thành công giá sản phẩm mới là: " + newPrice);
                    product.setPrice(newPrice);
                    break;
                case 4:
                    System.out.println("Nhập số lượng sản phẩm mới: ");
                    int newQuantity = Integer.parseInt(scanner.nextLine());
                    System.out.println("Bạn đã sửa thành công số lượng sản phẩm mới là: " + newQuantity);
                    product.setPrice(newQuantity);
                    break;
                case 0:
                    ProductManagerController.menu();
            }
        } while (true);
    }

    @Override
    public void sortProductPrice() {
        System.out.println("Chọn cách thức sắp xếp theo giá: 1. Tăng dần || 2. Giảm dần");
        int option = Integer.parseInt(scanner.nextLine());
        if (option == 1) {
            System.out.println("Bạn đã sắp xếp thành công sản phẩm theo thứ tự giá tăng dần");
            productManagementRepository.sortProductPriceAscending();
        } else {
            System.out.println("Bạn đã sắp xếp thành công sản phẩm theo thứ tự giá giảm dần");
            productManagementRepository.sortProductPriceDescending();
        }

    }

    @Override
    public void searchProductName() {
        System.out.println("Nhập chuỗi ký tự liên quan tên sản phẩm: ");
        String name = scanner.nextLine();
        String searchName = name.toLowerCase();
        System.out.println("Các sản phẩm liên quan chuỗi: " + name + " là");
        List<Product> resultList = productManagementRepository.getProductByName(searchName);
        if (resultList != null) {
            for (Product product : resultList) {
                System.out.println(product);
            }
        } else {
            System.out.println("Không tìm thấy sản phẩm tương ứng chuỗi: " + name);
        }
    }
}
