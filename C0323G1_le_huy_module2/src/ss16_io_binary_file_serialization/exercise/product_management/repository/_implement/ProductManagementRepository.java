package ss16_io_binary_file_serialization.exercise.product_management.repository._implement;

import ss16_io_binary_file_serialization.exercise.product_management.common.ReadAndWriteFile;
import ss16_io_binary_file_serialization.exercise.product_management.model.Product;
import ss16_io_binary_file_serialization.exercise.product_management.repository._interface.IProductMangementRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductManagementRepository implements IProductMangementRepository {
    private static List<Product> productList = new ArrayList<>();
    private static final String PATH_PRODUCT = "src/ss16_io_binary_file_serialization/exercise/product_management/data/data.txt";
    public static ReadAndWriteFile<Product> readAndWriteFile = new ReadAndWriteFile<>();

    @Override
    public List<Product> getAllProduct() {
        productList = readAndWriteFile.readFromFile(PATH_PRODUCT);
        return productList;
    }

    @Override
    public void addProduct(Product newProduct) {
        productList = readAndWriteFile.readFromFile(PATH_PRODUCT);
        productList.add(newProduct);
        readAndWriteFile.writeToFile(PATH_PRODUCT,productList);
    }

    @Override
    public List<Product> getProductBySearchString(String string) {
        productList = readAndWriteFile.readFromFile(PATH_PRODUCT);
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
}
