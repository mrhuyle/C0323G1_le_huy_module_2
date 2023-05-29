package ss16_io_binary_file_serialization.exercise.product_management.repository._implement;

import ss16_io_binary_file_serialization.exercise.product_management.model.Product;
import ss16_io_binary_file_serialization.exercise.product_management.repository._interface.IProductMangementRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductManagementRepository implements IProductMangementRepository {
    private static List<Product> productList = new ArrayList<>();

//    static {
//        Product product1 = new Product("L001", "Macbook Pro", 3000, "Apple", "Base");
//        Product product2 = new Product("P001", "Iphone 14 Plus", 1000, "Apple", "Black");
//        Product product3 = new Product("P002", "Z Flip", 1500, "Samsung", "Pink");
//        productList.add(product1);
//        productList.add(product2);
//        productList.add(product3);
//    }

    @Override
    public List<Product> getAllProduct() {
        productList = readDataFromFile("src/ss16_io_binary_file_serialization/exercise/product_management/data/data.txt");
        return productList;
    }

    @Override
    public void addProduct(Product newProduct) {
        productList = getAllProduct();
        productList.add(newProduct);
        writeDataToFile("src/ss16_io_binary_file_serialization/exercise/product_management/data/data.txt", productList);
    }

    @Override
    public List<Product> getProductBySearchString(String string) {
        List<Product> resultList = new ArrayList<>();
        for (Product product : productList) {
            if (product.getName().toLowerCase().contains(string)) {
                resultList.add(product);
            }
        }
        if (!resultList.isEmpty()) {
            return resultList;
        } else {
            return null;
        }
    }
@Override
    public List<Product> readDataFromFile(String filePath) {
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            ObjectInputStream objectInputStream = new ObjectInputStream((fileInputStream));
            products = (List<Product>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (Exception e) {
            System.out.println("Can not read data file");
        }
        return products;
    }

    @Override
    public void writeDataToFile(String filePath, List<Product> productList) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(filePath);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(productList);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Can not write to data file");
        }
    }
}
