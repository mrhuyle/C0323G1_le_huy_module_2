package ss11_map.exercise.product_management.repository.implement_;

import ss11_map.exercise.product_management.model.Product;
import ss11_map.exercise.product_management.repository.interface_.IProductManagementRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

    @Override
    public void sortProductPriceAscending() {
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product product1, Product product2) {
                return product1.getPrice() - product2.getPrice();
            }
        });
    }

    @Override
    public void sortProductPriceDescending() {
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product product1, Product product2) {
                return product2.getPrice() - product1.getPrice();
            }
        });
    }

    @Override
    public List<Product> getProductByName(String name) {
        List<Product> resultList = new ArrayList<>();
        for (Product product: products) {
            if (product.getName().toLowerCase().contains(name)) {
                resultList.add(product);
            }
        }
        if (!resultList.isEmpty()) {
            return resultList;
        } else {
            return null;
        }
    }
}
