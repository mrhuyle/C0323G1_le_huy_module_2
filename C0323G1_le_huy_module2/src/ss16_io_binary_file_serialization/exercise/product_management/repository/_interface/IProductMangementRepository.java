package ss16_io_binary_file_serialization.exercise.product_management.repository._interface;

import ss16_io_binary_file_serialization.exercise.product_management.model.Product;

import java.util.List;

public interface IProductMangementRepository {
    List<Product> getAllProduct();
}
