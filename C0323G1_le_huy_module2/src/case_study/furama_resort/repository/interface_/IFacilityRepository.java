package case_study.furama_resort.repository.interface_;

import case_study.furama_resort.model.Facility;

import java.util.List;

public interface IFacilityRepository extends IRepository<Facility> {
    @Override
    default List<Facility> getAll() {
        return null;
    }

    @Override
    default void add(Facility T) {

    }

    @Override
    default void delete(Facility T) {

    }
}
