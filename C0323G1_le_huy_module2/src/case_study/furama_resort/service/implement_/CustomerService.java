package case_study.furama_resort.service.implement_;

import case_study.furama_resort.model.Employee;
import case_study.furama_resort.repository.implement_.CustomerRepository;
import case_study.furama_resort.repository.interface_.ICustomerRepository;
import case_study.furama_resort.service.interface_.ICustomerService;

public class CustomerService implements ICustomerService {
    private static ICustomerRepository customerRepository = new CustomerRepository();
    @Override
    public void displayList() {

    }

    @Override
    public void add() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void searchByName() {

    }

    @Override
    public boolean findCode(String code) {
        return false;
    }

    @Override
    public Employee cloneByCode(String code) {
        return null;
    }
}
