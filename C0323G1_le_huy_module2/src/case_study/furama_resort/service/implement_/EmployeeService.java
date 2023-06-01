package case_study.furama_resort.service.implement_;

import case_study.furama_resort.model.Employee;
import case_study.furama_resort.repository.implement_.EmployeeRepository;
import case_study.furama_resort.repository.interface_.IEmployeeRepository;
import case_study.furama_resort.service.interface_.IEmployeeService;
import case_study.furama_resort.utils.Validate;

import javax.swing.plaf.IconUIResource;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private static Scanner scanner = new Scanner(System.in);
    private static IEmployeeRepository employeeRepository = new EmployeeRepository();

    @Override
    public void displayList() {
        List<Employee> employeeList = employeeRepository.getAll();
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Override
    public void add() {
//        NV-0002,Louis,20/06/1989,true,123456789112,0905169777,louis@gmail.com,postgraduated,employee,700
        //Input employee code:
        String code;
        do {
            System.out.println("Input employee code (NV-YYYY): ");
            code = scanner.nextLine();
            if (!Validate.validateEmployeeCode(code)) {
                System.err.println("Invalid employee code (must follow a form NV-YYYY, with YYYY - a number has 4 digits");
                continue;
            }
            break;
        } while (true);

        //Input employee name:
        String name;
        do {
            System.out.println("Input employee name: ");
            name = scanner.nextLine();
            if (name.length() < 3) {
                System.err.println("Too short input");
                continue;
            }
            if (!Validate.validateEmployeeName(name)) {
                System.err.println("Invalid employee name (must follow: UpperCase at the beginning of each word)");
                continue;
            }
            break;
        } while (true);

        //Input employee birthdate:
        String birthdate;
        do {
            System.out.println("Input employee birthdate (YYYY-MM-DD): ");
            birthdate = scanner.nextLine();
            if (!Validate.validateDate(birthdate)) {
                System.err.println("Invalid date format");
                continue;
            } else if (!Validate.validateAge(birthdate)) {
                System.err.println("The age under 18");
                continue;
            }
            break;
        } while (true);

    }
}
