package case_study.furama_resort.repository.implement_;

import case_study.furama_resort.common.ReadWriteFile;
import case_study.furama_resort.model.Customer;
import case_study.furama_resort.model.Employee;
import case_study.furama_resort.repository.interface_.ICustomerRepository;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static final String CUSTOMER_PATH = "src/case_study/furama_resort/data/customer";
    private static List<Customer> customerList = new ArrayList<>();

    @Override
    public List<Customer> getAll() {
        customerList.clear();
        List<String> stringList = new ArrayList<>();
        stringList = ReadWriteFile.readFile(CUSTOMER_PATH);
        for (String str : stringList) {
            if (str != null) {
                String[] info = str.split(",");
                Customer newCustomer = new Customer(info[0], info[1], info[2], Boolean.parseBoolean(info[3]), info[4], info[5], info[6], info[7], info[8]);
                customerList.add(newCustomer);
            }
        }
        return customerList;
    }

    @Override
    public void add(Customer customer) {
        List<String> stringInfo = new ArrayList<>();
        stringInfo.add(getInfo(customer));
        ReadWriteFile.writeFile(CUSTOMER_PATH, stringInfo, true);
    }

    public String getInfo(Customer customer) {
        String stringInfo = customer.getCode() + "," + customer.getName() + "," + customer.getBirthdate() + "," + customer.isGender() + "," + customer.getId() + "," + customer.getPhoneNumber() + "," + customer.getEmail() + "," + customer.getType() + "," + customer.getAddress();
        return stringInfo;
    }

    @Override
    public void delete(Customer customer) {
        customerList = getAll();
        customerList.remove(customer);
        List<String> stringList = new ArrayList<>();
        for (Customer c: customerList) {
            stringList.add(getInfo(c));
        }
        ReadWriteFile.writeFile(CUSTOMER_PATH,stringList,false);
    }

    @Override
    public List<Customer> searchByName(String searchStr) {
        List<Customer> searchList = new ArrayList<>();
        customerList = getAll();
        for (Customer customer: customerList) {
            if (customer.getName().toLowerCase().contains(searchStr.toLowerCase())) {
                searchList.add(customer);
            }
        }
        return searchList;
    }
}
