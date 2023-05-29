package ss16_io_binary_file_serialization.exercise.product_management.repository._implement;

import ss16_io_binary_file_serialization.exercise.product_management.model.Product;
import ss16_io_binary_file_serialization.exercise.product_management.repository._interface.IProductMangementRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductManagementRepository implements IProductMangementRepository {
    private static List<Product> productList = new ArrayList<>();
    static {
        Product product1 = new Product("L001","Macbook Pro",3000,"Apple","Base");
        Product product2 = new Product("P001", "Iphone 14 Plus", 1000, "Apple", "Black");
        Product product3 = new Product("P002", "Z Flip", 1500, "Samsung", "Pink");
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
    }

    @Override
    public List<Product> getAllProduct() {
        return productList;
    }
}
