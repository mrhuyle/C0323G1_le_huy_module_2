package case_study.furama_resort.service.implement_;

import case_study.furama_resort.model.Customer;
import case_study.furama_resort.model.Employee;
import case_study.furama_resort.repository.implement_.CustomerRepository;
import case_study.furama_resort.repository.interface_.ICustomerRepository;
import case_study.furama_resort.service.interface_.ICustomerService;
import case_study.furama_resort.utils.Validate;

import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    private static Scanner scanner = new Scanner(System.in);
    private static ICustomerRepository customerRepository = new CustomerRepository();

    @Override
    public void displayList() {
        List<Customer> customerList = customerRepository.getAll();
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    @Override
    public void add() {
        //Input customer code:
        String code;
        do {
            System.out.println("Input customer code (KH-YYYY): ");
            code = scanner.nextLine();
            if (!Validate.validateCustomerCode(code)) {
                System.err.println("Invalid customer code (must follow a form KH-YYYY, with YYYY - a number has 4 digits");
                continue;
            }
            break;
        } while (true);

        //Input customer name:
        String name;
        do {
            System.out.println("Input customer name: ");
            name = scanner.nextLine();
            if (name.length() < 3) {
                System.err.println("Too short input");
                continue;
            }
            if (!Validate.validateName(name)) {
                System.err.println("Invalid employee name (must follow: UpperCase at the beginning of each word)");
                continue;
            }
            break;
        } while (true);

        //Input customer birthdate:
        String birthdate;
        do {
            System.out.println("Input customer birthdate (YYYY-MM-DD): ");
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

        //Input customer gender:
        boolean gender;
        do {
            System.out.println("Input customer gender: 1. Male || 2. Female");
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
            System.out.println("Input customer ID number (number 9 digits or number 12 digits): ");
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
            System.out.println("Input customer phone number (start with 0 and follow by 9 digits number): ");
            phoneNumber = scanner.nextLine();
            if (!Validate.validatePhoneNumber(phoneNumber)) {
                System.err.println("Invalid phone number (start with 0 and follow by 9 digits number)");
                continue;
            }
            break;
        } while (true);

        //Input customer mail:
        String email;
        do {
            System.out.println("Input customer email: ");
            email = scanner.nextLine();
            if (!Validate.validateEmail(email)) {
                System.err.println("Invalid email");
                continue;
            }
            break;
        } while (true);

        //Input customer type:
        int optionType;
        String customerType;
        do {
            try {
                System.out.println("Choose customer type: 1. Diamond || 2. Platinum || 3. Gold || 4. Silver || 5. Member");
                System.out.println("Input option: ");
                optionType = Integer.parseInt(scanner.nextLine());
                switch (optionType) {
                    case 1:
                        customerType = "Diamond";
                        break;
                    case 2:
                        customerType = "Platinum";
                        break;
                    case 3:
                        customerType = "Gold";
                        break;
                    case 4:
                        customerType = "Silver";
                        break;
                    case 5:
                        customerType = "Member";
                        break;
                    default:
                        throw new NumberFormatException();
                }
                break;
            } catch (NumberFormatException e) {
                System.err.println("Invalid option. Option must be 1 to 4");
            }
        } while (true);

        //Input customer address:
        String address;
        do {
            System.out.println("Input customer address: ");
            address = scanner.nextLine();
            if (address.length() < 3 || address.length()>100) {
                System.err.println("Too short/long input address");
                continue;
            }
            break;
        } while (true);

        //Create new customer:
        Customer newCustomer = new Customer(code,name,birthdate,gender,id,phoneNumber,email,customerType,address);
        customerRepository.add(newCustomer);
    }
    @Override
    public void delete() {
        //Input employee code and check before delete:
        System.out.println("Input customer code to delete: ");
        String codeToDelete;
        do {
            codeToDelete = scanner.nextLine();
            if (!Validate.validateEmployeeCode(codeToDelete)) {
                System.err.println("Invalid customer code (must follow a form KH-YYYY, with YYYY - a number has 4 digits");
                continue;
            }
            if (!findCode(codeToDelete)) {
                System.err.println("Do not find the employee with this code.Input again");
                continue;
            }
            break;
        } while (true);

        //Confirm and delete:
        System.out.println("Do you want to delete the customer with code: " + codeToDelete);
        int option;
        do {
            try {
                System.out.println("1. Confirm || 2.Cancel");
                option = Integer.parseInt(scanner.nextLine());
                if (option == 1) {
                    System.out.println("Delete successful");
                    customerRepository.delete(getByCode(codeToDelete));
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

    }

    @Override
    public void searchByName() {

    }

    @Override
    public boolean findCode(String code) {
        List<Customer> customerList = customerRepository.getAll();
        for (Customer customer: customerList) {
            if (customer.getCode().equals(code)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Customer cloneByCode(String code) {
        return null;
    }

    @Override
    public Customer getByCode(String code) {
        List<Customer> customerList = customerRepository.getAll();
        for (Customer customer: customerList) {
            if(customer.getCode().equals(code)) {
                return customer;
            }
        }
        return null;
    }
}
