package case_study.furama_resort.repository.interface_;

import case_study.furama_resort.model.Employee;

import java.util.List;

public interface IEmployeeRepository extends Repository<Employee> {
    @Override
    default List<Employee> getAll() {
        return null;
    }
}
