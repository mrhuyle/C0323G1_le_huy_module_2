package case_study.furama_resort.repository.interface_;

import case_study.furama_resort.model.Customer;

import java.util.List;

public interface ICustomerIRepository extends IRepository<Customer> {
    @Override
    default List<Customer> getAll() {
        return null;
    }

    @Override
    default void add(Customer T) {

    }

    @Override
    default void delete(Customer T) {

    }
}
