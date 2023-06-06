package case_study.furama_resort.service.implement_;

import case_study.furama_resort.model.Facility;
import case_study.furama_resort.repository.implement_.FacilityRepository;
import case_study.furama_resort.repository.interface_.IFacilityRepository;
import case_study.furama_resort.service.interface_.IFacilityService;
import case_study.furama_resort.utils.Validate;
import com.sun.beans.editors.IntegerEditor;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLBoundOperation;

import java.util.*;

public class FacilityService implements IFacilityService {
    private static final IFacilityRepository facilityRepository = new FacilityRepository();
    private static final Scanner scanner = new Scanner(System.in);

    @Override
    public void displayList() {
        LinkedHashMap<Facility, Integer> facilityLinkedHashMap = facilityRepository.getAllWithUsages();
        Set<Facility> facilitySet = facilityLinkedHashMap.keySet();
        for (Facility facility : facilitySet) {
            System.out.println(facility + ", usages = " + facilityLinkedHashMap.get(facility) + " times");
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
            System.out.println("Input facility area: ");
            area = Float.parseFloat(scanner.nextLine());
            if (area < 30) {
                System.err.println("The facility area must be greater than 30 m2. Input again");
                continue;
            }
            break;
        } while (true);

        //Input facility fee:
        int fee;
        do {
            System.out.println("Input facility fee: ");
            fee = Integer.parseInt(scanner.nextLine());
            if (fee <= 0) {
                System.err.println("The facility fee must be greater than 0 $. Input again.");
                continue;
            }
            break;
        } while (true);

        //Input facility occupancy:
        int occupancy;
        do {
            System.out.println("Input facility occupancy: ");
            occupancy = Integer.parseInt(scanner.nextLine());
            if (occupancy <= 0 || occupancy > 20) {
                System.err.println("The occupancy (number of people) must be greater than 0 and lower than 20.");
                continue;
            }
            break;
        } while (true);

        //Input rentalType:
        String rentalType;
        int optionRentalType;
        do {
            try {
                System.out.println("Choose the facility rental type: 1. Yearly || 2. Monthly || 3. Daily || 4. Hourly");
                optionRentalType = Integer.parseInt(scanner.nextLine());
                switch (optionRentalType) {
                    case 1:
                        rentalType = "Yearly";
                        break;
                    case 2:
                        rentalType = "Monthly";
                        break;
                    case 3:
                        rentalType = "Daily";
                        break;
                    case 4:
                        rentalType = "Hourly";
                        break;
                    default:
                        throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                System.err.println("Invalid option. Must be 1 - 4.Input again.");
            }
            break;
        } while (true);


        //Classify VILLA / HOUSE / ROOM and input specific properties of them.
        if (code.contains("SVVL") || code.contains("SVHO")) { //Classify VILLA/HOUSE
            //Input Villa/House standard:
            String standard;
            int optionStandard;
            do {
                try {
                    System.out.println("Choose facility standard: 1. President || 2. Deluxe || 3. Standard");
                    optionStandard = Integer.parseInt(scanner.nextLine());
                    switch (optionStandard) {
                        case 1:
                            standard = "President";
                            break;
                        case 2:
                            standard = "Deluxe";
                            break;
                        case 3:
                            standard = "Standard";
                            break;
                        default:
                            throw new NumberFormatException();
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.err.println("Invalid option. Must be 1 - 3.Input again.");
                }
                break;
            } while (true);
            //Input VILLA/HOUSE number of floors:
            int numberOfFloors;
            do {
                numberOfFloors = Integer.parseInt(scanner.nextLine());
                if (numberOfFloors < 0) {
                    System.err.println("Invalid number of floors. Must be integer and greater than 0.Input again.");
                    continue;
                }
                break;
            } while (true);
        } else if (code.contains("SVVL") && !code.contains("SVHO")) { //Classify Villa
            //Input villa pool area:
            float poolArea;
            do  {
                poolArea = Float.parseFloat(scanner.nextLine());
                if (poolArea<30) {
                    System.err.println("Invalid pool area. Must be greater than 30 m2. Input again.");
                    continue;
                }
                break;
            } while (true);
        } else if (code.contains("SVRO")) { //Classify Room
            //Input house freeService:
            String freeService;
            do {
                freeService = scanner.nextLine();
                if (freeService.length()<3 || freeService.trim().isEmpty()) {
                    System.err.println("Invalid input (too short or empty). Input again.");
                    continue;
                }
                break;
            } while (true);
        }
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
