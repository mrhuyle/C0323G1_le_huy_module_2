package case_study.furama_resort.repository.implement_;

import case_study.furama_resort.model.Contract;
import case_study.furama_resort.repository.interface_.IContractRepository;

import java.util.List;

public class ContractRepository implements IContractRepository {
    @Override
    public List<Contract> getAll() {
        return IContractRepository.super.getAll();
    }

    @Override
    public void add(Contract T) {
        IContractRepository.super.add(T);
    }

    @Override
    public void delete(Contract T) {
        IContractRepository.super.delete(T);
    }
}
