package case_study.furama_resort.repository.implement_;

import case_study.furama_resort.model.Customer;
import case_study.furama_resort.repository.interface_.ICustomerRepository;

import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static final String CUSTOMER_PATH = "src/case_study/furama_resort/data/customer.csv";
    @Override
    public List<Customer> getAll() {

        return null;
    }

    @Override
    public void add(Customer T) {

    }
}
