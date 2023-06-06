package case_study.furama_resort.repository.interface_;

import case_study.furama_resort.model.Facility;

import java.util.LinkedHashMap;
import java.util.List;

public interface IFacilityRepository {

    LinkedHashMap<Facility,Integer> getAllWithUsages();
}
