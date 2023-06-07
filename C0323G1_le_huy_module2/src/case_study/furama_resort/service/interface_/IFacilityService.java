package case_study.furama_resort.service.interface_;

import case_study.furama_resort.model.Facility;

public interface IFacilityService extends IService {
    @Override
    default void displayList() {
    }
    void add();
    Facility getFacilityByCode(String code);
    void delete();
}
