package case_study.furama_resort.repository.interface_;

import case_study.furama_resort.model.Employee;

import java.util.List;

public interface IEmployeeRepository extends IRepository<Employee> {
    @Override
    List<Employee> getAll();

    @Override
    default void add(Employee employee) {

    }

    @Override
    default void delete(Employee employee) {

    }

    List<Employee> searchByName(String searchStr);
}
