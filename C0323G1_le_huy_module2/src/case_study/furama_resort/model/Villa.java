package case_study.furama_resort.model;

public class Villa extends Facility {
    private String standard;
    private float poolArea; //area of a pool in villa
    private int numberOfFloors;

    public Villa(String code, String name, float area, int fee, int occupancy, String rentalType, String standard, float poolArea, int numberOfFloors) {
        super(code, name, area, fee, occupancy, rentalType);
        this.standard = standard;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public float getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(float poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return ">>> Villa: " +
                super.toString() +
                ", standard = " + standard +
                ", poolArea = " + poolArea +" m2" +
                ", numberOfFloors = " + numberOfFloors + " floors";
    }
}
