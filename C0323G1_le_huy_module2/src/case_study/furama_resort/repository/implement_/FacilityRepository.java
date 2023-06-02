package case_study.furama_resort.repository.implement_;

import case_study.furama_resort.model.Facility;
import case_study.furama_resort.repository.interface_.IFacilityRepository;

import java.util.List;

public class FacilityRepository implements IFacilityRepository {
    @Override
    public List<Facility> getAll() {
        return IFacilityRepository.super.getAll();
    }

    @Override
    public void add(Facility T) {
        IFacilityRepository.super.add(T);
    }

    @Override
    public void delete(Facility T) {
        IFacilityRepository.super.delete(T);
    }
}
