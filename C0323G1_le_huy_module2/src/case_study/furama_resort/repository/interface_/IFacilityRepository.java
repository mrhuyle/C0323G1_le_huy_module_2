package case_study.furama_resort.repository.interface_;

import case_study.furama_resort.model.Facility;

import java.util.LinkedHashMap;
import java.util.List;

public interface IFacilityRepository extends IRepository<Facility> {
    @Override
    default List<Facility> getAll() {
        return null;
    }

    LinkedHashMap<Facility,Integer> getAllWithUsages();

    @Override
    default void add(Facility T) {

    }

    @Override
    default void delete(Facility T) {

    }
}
