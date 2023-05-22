package ss11_map.exercise.product_management.service.interface__;

public interface IProductManagementService {
    void displayAll();
    void addProduct();
    void deleteProduct();
    void editProduct();
    void sortProductPrice();
    void searchProductName();
    void checkProductId(String id);
}
