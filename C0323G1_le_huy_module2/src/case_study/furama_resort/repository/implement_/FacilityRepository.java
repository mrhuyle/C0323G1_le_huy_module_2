package case_study.furama_resort.repository.implement_;

import case_study.furama_resort.common.ReadWriteFile;
import case_study.furama_resort.model.Facility;
import case_study.furama_resort.model.House;
import case_study.furama_resort.model.Room;
import case_study.furama_resort.model.Villa;
import case_study.furama_resort.repository.interface_.IFacilityRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class FacilityRepository implements IFacilityRepository {
    private static final String FACILITY_PATH = "src/case_study/furama_resort/data/facility";
    private static LinkedHashMap<Facility, Integer> facilityLinkedHashMap = new LinkedHashMap<>();
    private static List<Facility> facilityList = new ArrayList<>();

    @Override
    public LinkedHashMap<Facility, Integer> getAllWithUsages() {
        List<String> stringList = ReadWriteFile.readFile(FACILITY_PATH);
        for (String str : stringList) {
            String[] info = str.split(",");
            if (info[0].contains("SVVL")) {
                Facility newVilla = new Villa(info[0], info[1], Float.parseFloat(info[2]), Integer.parseInt(info[3]), Integer.parseInt(info[4]), info[5], info[6], Float.parseFloat(info[7]), Integer.parseInt(info[8]));
                facilityList.add(newVilla);
                facilityLinkedHashMap.put(newVilla,Integer.parseInt(info[9]));
            } else if (info[0].contains("SVHO")) {
                Facility newHouse = new House(info[0], info[1], Float.parseFloat(info[2]), Integer.parseInt(info[3]), Integer.parseInt(info[4]), info[5], info[6],Integer.parseInt(info[7]));
                facilityList.add(newHouse);
                facilityLinkedHashMap.put(newHouse,Integer.parseInt(info[8]));
            } else if (info[0].contains("SVRO")) {
                Facility newRoom = new Room(info[0], info[1], Float.parseFloat(info[2]), Integer.parseInt(info[3]), Integer.parseInt(info[4]), info[5], info[6]);
                facilityList.add(newRoom);
                facilityLinkedHashMap.put(newRoom,Integer.parseInt(info[7]));
            }
        }
        return facilityLinkedHashMap;
    }

    @Override
    public List<Facility> getAll() {
        List<String> stringList = ReadWriteFile.readFile(FACILITY_PATH);
        for (String str : stringList) {
            String[] info = str.split(",");
            if (info[0].contains("SVVL")) {
                Facility newVilla = new Villa(info[0], info[1], Float.parseFloat(info[2]), Integer.parseInt(info[3]), Integer.parseInt(info[4]), info[5], info[6], Float.parseFloat(info[7]), Integer.parseInt(info[8]));
                facilityList.add(newVilla);
                facilityLinkedHashMap.put(newVilla,Integer.parseInt(info[9]));
            } else if (info[0].contains("SVHO")) {
                Facility newHouse = new House(info[0], info[1], Float.parseFloat(info[2]), Integer.parseInt(info[3]), Integer.parseInt(info[4]), info[5], info[6],Integer.parseInt(info[7]));
                facilityList.add(newHouse);
                facilityLinkedHashMap.put(newHouse,Integer.parseInt(info[8]));
            } else if (info[0].contains("SVRO")) {
                Facility newRoom = new Room(info[0], info[1], Float.parseFloat(info[2]), Integer.parseInt(info[3]), Integer.parseInt(info[4]), info[5], info[6]);
                facilityList.add(newRoom);
                facilityLinkedHashMap.put(newRoom,Integer.parseInt(info[7]));
            }
        }
        return facilityList;
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

