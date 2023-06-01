package case_study.furama_resort.repository.implement_;

import case_study.furama_resort.common.ReadWriteFile;
import case_study.furama_resort.model.Employee;
import case_study.furama_resort.model.Person;
import case_study.furama_resort.repository.interface_.IEmployeeRepository;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private static final String EMPLOYEE_PATH = "src/case_study/furama_resort/data/employee";
    @Override
    public List<Employee> getAll() {
        List<String> stringList = ReadWriteFile.readFile(EMPLOYEE_PATH);
        List<Employee> employeeList = new ArrayList<>();
        for (String str: stringList) {
            if(str != null) {
                String [] info = str.split(",");
                Employee newEmployee = new Employee(info[0],info[1],info[2],Boolean.parseBoolean(info[3]),info[4],info[5],info[6],info[7],info[8],Integer.parseInt(info[9]));
                employeeList.add(newEmployee);
            }
        }
        return employeeList;
    }
}
