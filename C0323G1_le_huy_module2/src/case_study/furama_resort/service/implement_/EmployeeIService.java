package case_study.furama_resort.service.implement_;

import case_study.furama_resort.model.Employee;
import case_study.furama_resort.repository.implement_.EmployeeIRepository;
import case_study.furama_resort.repository.interface_.IEmployeeIRepository;
import case_study.furama_resort.service.interface_.IEmployeeIService;
import case_study.furama_resort.utils.Validate;

import java.util.List;
import java.util.Scanner;

public class EmployeeIService implements IEmployeeIService {
    private static Scanner scanner = new Scanner(System.in);
    private static IEmployeeIRepository employeeRepository = new EmployeeIRepository();

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

        //Input employee gender:
        boolean gender;
        do {
            System.out.println("Input employee gender: 1. Male || 2. Female");
            try {
                int option = Integer.parseInt(scanner.nextLine());
                if (option == 1) {
                    gender = true;
                } else if (option == 2) {
                    gender = false;
                } else {
                    throw new NumberFormatException();
                }
                break;
            } catch (NumberFormatException e) {
                System.err.println("Input option must be 1 or 2");
            }
        } while (true);

        //Input id number:
        String id;
        do {
            System.out.println("Input ID number (number 9 digits or number 12 digits): ");
            id = scanner.nextLine();
            if (!Validate.validateID(id) || id.trim().isEmpty()) {
                System.err.println("Invalid ID (number 9 digits or number 12 digits)");
                continue;
            }
            break;
        } while (true);

        //Input employee phone number:
        String phoneNumber;
        do {
            System.out.println("Input employee phone number (start with 0 and follow by 9 digits number): ");
            phoneNumber = scanner.nextLine();
            if (!Validate.validatePhoneNumber(phoneNumber)) {
                System.err.println("Invalid phone number (start with 0 and follow by 9 digits number)");
                continue;
            }
            break;
        } while (true);

        //Input employee mail:
        String email;
        do {
            System.out.println("Input employee email: ");
            email = scanner.nextLine();
            if (!Validate.validateEmail(email)) {
                System.err.println("Invalid email");
                continue;
            }
            break;
        } while (true);

        //Input employee academic level:
        String academicLevel;
        do {
            System.out.println("Choose employee academic level: 1. Intermediate || 2. College || 3. Bachelor || 4. Postgraduated");
            try {
                int option = Integer.parseInt(scanner.nextLine());
                switch (option) {
                    case 1:
                        academicLevel = "Intermediate";
                        break;
                    case 2:
                        academicLevel = "College";
                        break;
                    case 3:
                        academicLevel = "Bachelor";
                        break;
                    case 4:
                        academicLevel = "Postgraduated";
                        break;
                    default:
                        throw new NumberFormatException();
                }
                break;
            } catch (NumberFormatException e) {
                System.err.println("Option must be 1 to 4");
            }
        } while (true);

        //Input employee position:
        String position;
        do {
            System.out.println("Choose employee academic level: 1. receptionist || 2. waiter/waitress || 3. specialist || 4. supervisor || 5. manager || 6. director");
            try {
                int option = Integer.parseInt(scanner.nextLine());
                switch (option) {
                    case 1:
                        position = "receptionist";
                        break;
                    case 2:
                        position = "waiter/waitress";
                        break;
                    case 3:
                        position = "specialist";
                        break;
                    case 4:
                        position = "supervisor";
                        break;
                    case 5:
                        position = "manager";
                        break;
                    case 6:
                        position = "director";
                        break;
                    default:
                        throw new NumberFormatException();
                }
                break;
            } catch (NumberFormatException e) {
                System.err.println("Option must be 1 to 6");
            }
        } while (true);

        //Input employee salary:
        float salary;
        do {
            try {
                System.out.println("Input employee salary: ");
                salary = Float.parseFloat(scanner.nextLine());
                if (salary < 0) {
                    throw new NumberFormatException();
                }
                break;
            } catch (NumberFormatException e) {
                System.err.println("Invalid salary (wrong number format or salary < 0)");
            }
        } while (true);

        //Create new employee:
        Employee newEmployee = new Employee(code, name, birthdate, gender, id, phoneNumber, email, academicLevel, position, salary);

        //Confirm:
        System.out.println("Do you wan to add new employee with this infomation below: ");
        System.out.println(newEmployee.toString());
        int option;
        do {
            try {
                System.out.println("1. Confirm || 2.Cancel");
                option = Integer.parseInt(scanner.nextLine());
                if (option == 1) {
                    System.out.println("Added successful");
                    employeeRepository.add(newEmployee);
                } else if (option == 2) {
                    System.out.println("You chose to cancel ");
                } else {
                    throw new NumberFormatException();
                }
                break;
            } catch (NumberFormatException e) {
                System.err.println("Invalid option. Must be 1 or 2.");
            }
        } while (true);
    }

    @Override
    public void edit() {
        //Input employee code and check code exist:
        System.out.println("Input employee code that you want to edit: ");
        String codeToEdit;
        do {
            codeToEdit = scanner.nextLine();
            if (!Validate.validateEmployeeCode(codeToEdit)) {
                System.err.println("Invalid employee code (must follow a form NV-YYYY, with YYYY - a number has 4 digits");
                continue;
            }
            if (!findCode(codeToEdit)) {
                System.err.println("Do not find the employee with this code.Input again");
                continue;
            }
            break;
        } while (true);

        //Edit steps
        System.out.println("Choose the data field you want to edit: ");
        System.out.println("1. Code || 2. Name || 3. Birthdate || 4. Gender || 5. ID number || 6. Phone || 7. Email || 8. Academic level || 9. Position || 10. Salary");
        int option;
        Employee duplicateEmployee = cloneEmployeeByCode(codeToEdit);
        String editInfo = "";
        do {
            try {
                option = Integer.parseInt(scanner.nextLine());
                switch (option) {
                    case 1:
                        String newCode;
                        do {
                            System.out.println("Input new employee code to edit: ");
                            newCode = scanner.nextLine();
                            if (!Validate.validateEmployeeCode(newCode)) {
                                System.err.println("Invalid employee code (must follow a form NV-YYYY, with YYYY - a number has 4 digits");
                                continue;
                            }
                            editInfo = "Code: " + newCode;
                            duplicateEmployee.setCode(newCode);
                            break;
                        } while (true);
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        break;
                    case 9:
                        break;
                    case 10:
                        break;
                    default:
                        throw new NumberFormatException();
                }
                break;
            } catch (NumberFormatException e) {
                System.err.println("Invalid option. Must be 1 to 10.");
            }
        } while (true);
        employeeRepository.delete(getEmployeeByCode(codeToEdit));
        employeeRepository.add(duplicateEmployee);
    }

    @Override
    public void delete() {
        //Input employee code and check before delete:
        System.out.println("Input employee code to delete: ");
        String codeToDelete;
        do {
            codeToDelete = scanner.nextLine();
            if (!Validate.validateEmployeeCode(codeToDelete)) {
                System.err.println("Invalid employee code (must follow a form NV-YYYY, with YYYY - a number has 4 digits");
                continue;
            }
            if (!findCode(codeToDelete)) {
                System.err.println("Do not find the employee with this code.Input again");
                continue;
            }
            break;
        } while (true);

        //Confirm and delete:
        System.out.println("Do you want to delete the employee with code: " + codeToDelete);
        int option;
        do {
            try {
                System.out.println("1. Confirm || 2.Cancel");
                option = Integer.parseInt(scanner.nextLine());
                if (option == 1) {
                    System.out.println("Delete successful");
                    employeeRepository.delete(getEmployeeByCode(codeToDelete));
                } else if (option == 2) {
                    System.out.println("You chose to cancel ");
                } else {
                    throw new NumberFormatException();
                }
                break;
            } catch (NumberFormatException e) {
                System.err.println("Invalid option. Must be 1 or 2.");
            }
        } while (true);
    }

    //CheckCode: check the employee code is exist, return boolean
    public boolean findCode(String code) {
        List<Employee> employeeList = employeeRepository.getAll();
        for (Employee employee : employeeList) {
            if (employee.getCode().equals(code)) {
                return true;
            }
        }
        return false;
    }

    //getEmployeeByCode: make a duplicate new employee with same properties with employee existed (by code).
    public Employee cloneEmployeeByCode(String code) {
        List<Employee> employeeList = employeeRepository.getAll();
        Employee duplicateEmployee = new Employee();
        for (Employee employee : employeeList) {
            if (employee.getCode().equals(code)) {
                duplicateEmployee = new Employee(employee.getCode(), employee.getName(), employee.getBirthdate(), employee.isGender(), employee.getId(), employee.getPhoneNumber(), employee.getEmail(), employee.getAcademicLevel(), employee.getPosition(), employee.getSalary());
            }
        }
        return duplicateEmployee;
    }

    public Employee getEmployeeByCode(String code) {
        List<Employee> employeeList = employeeRepository.getAll();
        for (Employee employee : employeeList) {
            if (employee.getCode().equals(code)) {
                return employee;
            }
        }
        return null;
    }

}
