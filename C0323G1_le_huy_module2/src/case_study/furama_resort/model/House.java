package case_study.furama_resort.model;

public class House extends Facility {
    private String standard;
    private String numberofFloors;

    public House(String code, String name, float area, int fee, int occupancy, String rentalType, String standard, String numberofFloors) {
        super(code, name, area, fee, occupancy, rentalType);
        this.standard = standard;
        this.numberofFloors = numberofFloors;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getNumberofFloors() {
        return numberofFloors;
    }

    public void setNumberofFloors(String numberofFloors) {
        this.numberofFloors = numberofFloors;
    }
}
