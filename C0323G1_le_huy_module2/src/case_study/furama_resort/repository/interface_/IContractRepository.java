package case_study.furama_resort.repository.interface_;

import case_study.furama_resort.model.Contract;

import java.util.List;

public interface IContractRepository extends IRepository<Contract> {
    @Override
    default List<Contract> getAll() {
        return null;
    }

    @Override
    default void add(Contract T) {

    }

    @Override
    default void delete(Contract T) {

    }
}
