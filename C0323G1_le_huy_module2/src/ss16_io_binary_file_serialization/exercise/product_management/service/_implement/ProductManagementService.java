package ss16_io_binary_file_serialization.exercise.product_management.service._implement;

import ss16_io_binary_file_serialization.exercise.product_management.model.Product;
import ss16_io_binary_file_serialization.exercise.product_management.repository._implement.ProductManagementRepository;
import ss16_io_binary_file_serialization.exercise.product_management.repository._interface.IProductMangementRepository;
import ss16_io_binary_file_serialization.exercise.product_management.service._interface.IProductMangementService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManagementService implements IProductMangementService {
    private static Scanner scanner = new Scanner(System.in);
    private static IProductMangementRepository productManagementRepository = new ProductManagementRepository();
    private static List<Product> productList = new ArrayList<>();

    @Override
    public void displayProductList() {
        productList = productManagementRepository.getAllProduct();
        System.out.println("---------Display products list---------");
        for (Product p : productList) {
            System.out.println(p);
        }
        System.out.println("------------End of list------------");
    }

    @Override
    public void addProduct() {
        System.out.println("Create a new product by following the steps:");
        //Input product id:
        String id;
        System.out.println("Input product ID: ");
        id = scanner.nextLine();

        //Input product name:
        String name;
        System.out.println("Input product name: ");
        name = scanner.nextLine();

        //Input product price:
        int price;
        System.out.println("Input product price: ");
        price = Integer.parseInt(scanner.nextLine());

        //Input product brand:
        String brand;
        System.out.println("Input product brand: ");
        brand = scanner.nextLine();

        //Input product details:
        String details;
        System.out.println("Input product details: ");
        details = scanner.nextLine();

        Product newProduct = new Product(id, name, price, brand, details);
        productManagementRepository.addProduct(newProduct);

    }

    @Override
    public void searchProduct() {
        System.out.println("Search a exist product by following the steps: ");
        //Input product Id to search:
        System.out.println("Input string relate to product name to search: ");
        String string;
        string = scanner.nextLine().toLowerCase();
        List<Product> resultList = productManagementRepository.getProductBySearchString(string);
        if (resultList == null) {
            System.out.println("Can not find product(s) with search string: " + string);
        } else {
            System.out.println("Search result:");
            for (Product product: resultList) {
                System.out.println(product);
            }
        }

    }
}
