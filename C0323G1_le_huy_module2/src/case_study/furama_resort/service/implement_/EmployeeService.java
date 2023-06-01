package case_study.furama_resort.service.implement_;

import case_study.furama_resort.model.Employee;
import case_study.furama_resort.repository.implement_.EmployeeRepository;
import case_study.furama_resort.repository.interface_.IEmployeeRepository;
import case_study.furama_resort.service.interface_.IEmployeeService;

import java.util.List;

public class EmployeeService implements IEmployeeService {
    private static IEmployeeRepository employeeRepository = new EmployeeRepository();

    @Override
    public void displayList() {
        List<Employee> employeeList = employeeRepository.getAll();
        for (Employee employee: employeeList) {
            System.out.println(employee);
        }
    }
}
