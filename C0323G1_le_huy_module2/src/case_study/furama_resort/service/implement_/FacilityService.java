package case_study.furama_resort.service.implement_;

import case_study.furama_resort.model.Facility;
import case_study.furama_resort.repository.implement_.FacilityRepository;
import case_study.furama_resort.repository.interface_.IFacilityRepository;
import case_study.furama_resort.service.interface_.IFacilityService;
import case_study.furama_resort.utils.Validate;

import java.util.*;

public class FacilityService implements IFacilityService {
    private static final IFacilityRepository facilityRepository = new FacilityRepository();
    private static final Scanner scanner = new Scanner(System.in);

    @Override
    public void displayList() {
        LinkedHashMap<Facility, Integer> facilityLinkedHashMap = facilityRepository.getAllWithUsages();
        Set<Facility> facilitySet = facilityLinkedHashMap.keySet();
        for (Facility facility : facilitySet) {
            System.out.println(facility + ", usages = " + facilityLinkedHashMap.get(facility));
        }
    }

    @Override
    public void add() {
        //Input new facility code:
        System.out.println("Input new facility code: ");
        String code;
        do {
            code = scanner.nextLine();
            if (!Validate.validateFacilityCode(code)) {
                System.err.println("Invalid facility code. The code must follow the rules: SVXX-YYYY (Villa: XX = VL, House: XX = HO, Room: XX= RO, and YYYY is the 4-digit number).Input again");
                continue;
            }
            if (getFacilityByCode(code) != null) {
                System.err.println("The facility code existed.Input again");
                continue;
            }
            break;
        } while (true);

        //Input Facility Name:
        String name;
        do {
            System.out.println("Input new facility name: ");
            name = scanner.nextLine();
            if (!Validate.validateFacilityName(name)) {
                System.err.println("Invalid facility name. The name must be start with A UpperCase word. Input again.");
                continue;
            }
            break;
        } while (true);

        //Input facility area:
        float area;
        do {
            area = Float.parseFloat(scanner.nextLine());
            if (area < 30) {
                System.err.println("The facility area must be greater than 30 m2. Input again");
                continue;
            }
            break;
        } while (true);

        //Input facility fee:

    }

    @Override
    public Facility getFacilityByCode(String code) {
        LinkedHashMap<Facility, Integer> facilityLinkedHashMap = facilityRepository.getAllWithUsages();
        Set<Facility> facilitySet = facilityLinkedHashMap.keySet();
        for (Facility facility : facilitySet) {
            if (facility.getCode().equals(code)) {
                return facility;
            }
        }
        return null;
    }
}
