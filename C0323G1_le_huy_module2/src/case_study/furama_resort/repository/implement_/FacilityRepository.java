package case_study.furama_resort.repository.implement_;

import case_study.furama_resort.common.ReadWriteFile;
import case_study.furama_resort.model.Facility;
import case_study.furama_resort.model.House;
import case_study.furama_resort.model.Room;
import case_study.furama_resort.model.Villa;
import case_study.furama_resort.repository.interface_.IFacilityRepository;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

public class FacilityRepository implements IFacilityRepository {
    private static final String FACILITY_PATH = "src/case_study/furama_resort/data/facility";
    private static LinkedHashMap<Facility, Integer> facilityLinkedHashMap = new LinkedHashMap<>();

    @Override
    public LinkedHashMap<Facility, Integer> getAllWithUsages() {
        facilityLinkedHashMap.clear();
        List<String> stringList = ReadWriteFile.readFile(FACILITY_PATH);
        for (String str : stringList) {
            String[] info = str.split(",");
            if (info[0].contains("SVVL")) {
                Facility newVilla = new Villa(info[0], info[1], Float.parseFloat(info[2]), Integer.parseInt(info[3]), Integer.parseInt(info[4]), info[5], info[6], Float.parseFloat(info[7]), Integer.parseInt(info[8]));
                facilityLinkedHashMap.put(newVilla, Integer.parseInt(info[9]));
            } else if (info[0].contains("SVHO")) {
                Facility newHouse = new House(info[0], info[1], Float.parseFloat(info[2]), Integer.parseInt(info[3]), Integer.parseInt(info[4]), info[5], info[6], Integer.parseInt(info[7]));
                facilityLinkedHashMap.put(newHouse, Integer.parseInt(info[8]));
            } else if (info[0].contains("SVRO")) {
                Facility newRoom = new Room(info[0], info[1], Float.parseFloat(info[2]), Integer.parseInt(info[3]), Integer.parseInt(info[4]), info[5], info[6]);
                facilityLinkedHashMap.put(newRoom, Integer.parseInt(info[7]));
            }
        }
        return facilityLinkedHashMap;
    }

//    @Override
//    public List<Facility> getAll() {
//        List<String> stringList = ReadWriteFile.readFile(FACILITY_PATH);
//        for (String str : stringList) {
//            String[] info = str.split(",");
//            if (info[0].contains("SVVL")) {
//                Facility newVilla = new Villa(info[0], info[1], Float.parseFloat(info[2]), Integer.parseInt(info[3]), Integer.parseInt(info[4]), info[5], info[6], Float.parseFloat(info[7]), Integer.parseInt(info[8]));
//                facilityList.add(newVilla);
//                facilityLinkedHashMap.put(newVilla,Integer.parseInt(info[9]));
//            } else if (info[0].contains("SVHO")) {
//                Facility newHouse = new House(info[0], info[1], Float.parseFloat(info[2]), Integer.parseInt(info[3]), Integer.parseInt(info[4]), info[5], info[6],Integer.parseInt(info[7]));
//                facilityList.add(newHouse);
//                facilityLinkedHashMap.put(newHouse,Integer.parseInt(info[8]));
//            } else if (info[0].contains("SVRO")) {
//                Facility newRoom = new Room(info[0], info[1], Float.parseFloat(info[2]), Integer.parseInt(info[3]), Integer.parseInt(info[4]), info[5], info[6]);
//                facilityList.add(newRoom);
//                facilityLinkedHashMap.put(newRoom,Integer.parseInt(info[7]));
//            }
//        }
//        return facilityList;
//    }


    @Override
    public void add(Facility facility) {
        facilityLinkedHashMap = getAllWithUsages();
        facilityLinkedHashMap.put(facility, 0);
        String str = getInfo(facility) + "," + "0";
        List<String> stringList = new ArrayList<>();
        stringList.add(str);
        ReadWriteFile.writeFile(FACILITY_PATH,stringList,true);
    }

    @Override
    public void delete(Facility facility) {
        facilityLinkedHashMap = getAllWithUsages();
        facilityLinkedHashMap.remove(facility);
        List<String> stringList = new ArrayList<>();
        Set<Facility> facilitySet = facilityLinkedHashMap.keySet();
        for (Facility f: facilitySet) {
            if (f != null) {
                String str = "";
                str = getInfo(f) + "," + facilityLinkedHashMap.get(f);
                stringList.add(str);
            }
        }
        ReadWriteFile.writeFile(FACILITY_PATH,stringList,false);
    }

    @Override
    public String getInfo(Facility facility) {
        String result = "";
        if (facility.getCode().contains("SVVL")) {
            result = facility.getCode() + "," + facility.getName() + "," + facility.getArea() + "," + facility.getFee()+ "," + facility.getOccupancy() + "," + facility.getRentalType() + "," + ((Villa) facility).getStandard() + "," + ((Villa) facility).getPoolArea() + "," + ((Villa) facility).getNumberOfFloors();
        } else if (facility.getCode().contains("SVHO")) {
            result = facility.getCode() + "," + facility.getName() + "," + facility.getArea() + "," + facility.getFee()+ "," +facility.getOccupancy() + "," + facility.getRentalType() + "," + ((House) facility).getStandard() + "," + ((House) facility).getNumberofFloors();
        } else {
            result = facility.getCode() + "," + facility.getName() + "," + facility.getArea() + "," + facility.getFee()+ "," +facility.getOccupancy() + "," + facility.getRentalType() + "," + ((Room) facility).getFreeService();
        }
        return result;
    }

    @Override
    public void plusUsage(Facility facility) {
        facilityLinkedHashMap = getAllWithUsages();
        System.out.println(facilityLinkedHashMap.get(facility));
        int plusUsage = facilityLinkedHashMap.get(facility) + 1; //Get the new value = old value + 1
        facilityLinkedHashMap.replace(facility,plusUsage); //replace old value
        System.out.println(facilityLinkedHashMap.get(facility));

        //Write file (overwrite):
        List<String> stringList = new ArrayList<>();
        Set<Facility> facilitySet = facilityLinkedHashMap.keySet();
        for (Facility f: facilitySet) {
            if (f != null) {
                String str = "";
                str = getInfo(f) + "," + facilityLinkedHashMap.get(f);
                stringList.add(str);
            }
        }
        ReadWriteFile.writeFile(FACILITY_PATH,stringList,false);
    }
}

