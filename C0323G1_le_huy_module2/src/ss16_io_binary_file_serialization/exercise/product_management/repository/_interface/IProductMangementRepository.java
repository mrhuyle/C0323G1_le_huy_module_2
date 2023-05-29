package ss16_io_binary_file_serialization.exercise.product_management.repository._interface;

import ss16_io_binary_file_serialization.exercise.product_management.model.Product;

import java.util.List;

public interface IProductMangementRepository {
    List<Product> getAllProduct();

    void addProduct(Product newProduct);

    List<Product> getProductBySearchString(String string);

    List<Product> readDataFromFile(String filePath);

    void writeDataToFile(String filePath, List<Product> productList);
}
