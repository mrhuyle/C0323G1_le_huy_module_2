package ss16_io_binary_file_serialization.exercise.product_management.service._implement;

import ss16_io_binary_file_serialization.exercise.product_management.model.Product;
import ss16_io_binary_file_serialization.exercise.product_management.repository._implement.ProductManagementRepository;
import ss16_io_binary_file_serialization.exercise.product_management.repository._interface.IProductMangementRepository;
import ss16_io_binary_file_serialization.exercise.product_management.service._interface.IProductMangementService;

import java.util.ArrayList;
import java.util.List;

public class ProductManagementService implements IProductMangementService {
private static IProductMangementRepository productManagementRepository = new ProductManagementRepository();
private static List<Product> productList = new ArrayList<>();
    @Override
    public void displayProduct() {
        productList = productManagementRepository.getAllProduct();
        for (Product p: productList) {
            System.out.println(p);
        }
    }
}
