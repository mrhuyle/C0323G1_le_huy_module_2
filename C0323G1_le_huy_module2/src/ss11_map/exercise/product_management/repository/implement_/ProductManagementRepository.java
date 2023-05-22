package ss11_map.exercise.product_management.repository.implement_;

import ss11_map.exercise.product_management.model.Product;
import ss11_map.exercise.product_management.repository.interface_.IProductManagementRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductManagementRepository implements IProductManagementRepository {
    private static List<Product> products = new ArrayList<>();
    static {
        products.add(new Product("B001","Coca Cola",10000,100));
        products.add(new Product("A002","Heineken",30000,200));
        products.add(new Product("X003","Durex",10000,300));
    }

    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public Product getProductById(String id) {
        for (Product product: products) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void deleteProduct(Product product) {
        products.remove(product);
    }
}
