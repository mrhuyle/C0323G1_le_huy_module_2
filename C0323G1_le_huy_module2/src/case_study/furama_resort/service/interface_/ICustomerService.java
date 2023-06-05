package case_study.furama_resort.service.interface_;

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

    Employee cloneByCode(String code);
}
