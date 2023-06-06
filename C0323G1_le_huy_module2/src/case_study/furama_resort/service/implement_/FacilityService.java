package case_study.furama_resort.service.implement_;

import case_study.furama_resort.model.Facility;
import case_study.furama_resort.repository.implement_.FacilityRepository;
import case_study.furama_resort.repository.interface_.IFacilityRepository;
import case_study.furama_resort.service.interface_.IFacilityService;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

public class FacilityService implements IFacilityService {
    private static IFacilityRepository facilityRepository = new FacilityRepository();
    @Override
    public void displayList() {
        LinkedHashMap<Facility,Integer> facilityLinkedHashMap = facilityRepository.getAllWithUsages();
        Set<Facility> facilitySet =  facilityLinkedHashMap.keySet();
        for (Facility facility: facilitySet) {
            System.out.println(facility + ", usages: " + facilityLinkedHashMap.get(facility));
        }
    }
}
