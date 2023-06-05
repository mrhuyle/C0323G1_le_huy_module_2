package case_study.furama_resort.service.interface_;

import case_study.furama_resort.model.Customer;
import case_study.furama_resort.model.Employee;

public interface ICustomerService extends IService {
    @Override
    default void displayList() {
    }

    void add();

    void delete();

    void edit();
    void searchByName();

    boolean findCode(String code);

    Customer cloneByCode(String code);

    Customer getByCode(String code);


}
