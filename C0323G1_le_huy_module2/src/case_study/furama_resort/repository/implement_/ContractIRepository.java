package case_study.furama_resort.repository.implement_;

import case_study.furama_resort.model.Contract;
import case_study.furama_resort.repository.interface_.IContractIRepository;

import java.util.List;

public class ContractIRepository implements IContractIRepository {
    @Override
    public List<Contract> getAll() {
        return IContractIRepository.super.getAll();
    }

    @Override
    public void add(Contract T) {
        IContractIRepository.super.add(T);
    }

    @Override
    public void delete(Contract T) {
        IContractIRepository.super.delete(T);
    }
}
