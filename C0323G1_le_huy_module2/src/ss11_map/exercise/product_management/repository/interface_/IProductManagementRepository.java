package ss11_map.exercise.product_management.repository.interface_;

import ss11_map.exercise.product_management.model.Product;
import java.util.List;

public interface IProductManagementRepository {
    List<Product> getAll();
    Product getProductById(String id);
    void deleteProduct(Product product);
}
