package case_study.furama_resort.repository.implement_;

import case_study.furama_resort.common.ReadWriteFile;
import case_study.furama_resort.model.Employee;
import case_study.furama_resort.repository.interface_.IEmployeeIRepository;

import java.util.ArrayList;
import java.util.List;

public class EmployeeIRepository implements IEmployeeIRepository {
    private static final String EMPLOYEE_PATH = "src/case_study/furama_resort/data/employee";
    private static List<Employee> employeeList = new ArrayList<>();

    @Override
    public List<Employee> getAll() {
        employeeList.clear();
        List<String> stringList = ReadWriteFile.readFile(EMPLOYEE_PATH);
        for (String str : stringList) {
            if (str != null) {
                String[] info = str.split(",");
                Employee newEmployee = new Employee(info[0], info[1], info[2], Boolean.parseBoolean(info[3]), info[4], info[5], info[6], info[7], info[8], Float.parseFloat(info[9]));
                employeeList.add(newEmployee);
            }
        }
        return employeeList;
    }

    @Override
    public void add(Employee employee) {
        employeeList = getAll();
        employeeList.add(employee);
        List<String> newLine = new ArrayList<>();
        newLine.add(getInfo(employee));
        ReadWriteFile.writeFile(EMPLOYEE_PATH, newLine, true);
    }

    public String getInfo(Employee employee) {
        String infoStr = "";
        infoStr += employee.getCode() + "," + employee.getName() + "," + employee.getBirthdate() + "," + employee.isGender() + "," + employee.getId() + "," + employee.getPhoneNumber() + "," + employee.getEmail() + "," + employee.getAcademicLevel() + "," + employee.getPosition() + "," + employee.getSalary();
        return infoStr;
    }
}
