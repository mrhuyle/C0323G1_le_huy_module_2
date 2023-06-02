package case_study.furama_resort.repository.implement_;

import case_study.furama_resort.model.Facility;
import case_study.furama_resort.repository.interface_.IFacilityIRepository;

import java.util.List;

public class FacilityIRepository implements IFacilityIRepository {
    @Override
    public List<Facility> getAll() {
        return IFacilityIRepository.super.getAll();
    }

    @Override
    public void add(Facility T) {
        IFacilityIRepository.super.add(T);
    }

    @Override
    public void delete(Facility T) {
        IFacilityIRepository.super.delete(T);
    }
}
