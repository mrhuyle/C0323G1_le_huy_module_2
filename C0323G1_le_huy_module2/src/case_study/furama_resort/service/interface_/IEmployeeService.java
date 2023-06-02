package case_study.furama_resort.service.interface_;

import case_study.furama_resort.model.Employee;

public interface IEmployeeService extends IService {
    @Override
    default void displayList() {
    }
    void add();
    void delete();

    void edit();

    boolean findCode(String code);

    Employee cloneEmployeeByCode(String code);
}
