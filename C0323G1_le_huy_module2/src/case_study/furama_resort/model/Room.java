package case_study.furama_resort.model;

public class Room extends Facility {
    private String freeService; //name of free service can be apply to Room

    public Room(String code, String name, float area, int fee, int occupancy, String rentalType, String freeService) {
        super(code, name, area, fee, occupancy, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return ">>> Room: " +
                super.toString() +
                ", freeService = " + freeService;
    }
}
