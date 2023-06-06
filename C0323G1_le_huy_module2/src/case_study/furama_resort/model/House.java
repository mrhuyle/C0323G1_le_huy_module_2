package case_study.furama_resort.model;

public class House extends Facility {
    private String standard;
    private int numberofFloors;

    public House(String code, String name, float area, int fee, int occupancy, String rentalType, String standard, int numberofFloors) {
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

    public int getNumberofFloors() {
        return numberofFloors;
    }

    public void setNumberofFloors(int numberofFloors) {
        this.numberofFloors = numberofFloors;
    }

    @Override
    public String toString() {
        return "*** House: " +
                super.toString() +
                ", standard = " + standard +
                ", numberofFloors = " + numberofFloors;
    }
}
