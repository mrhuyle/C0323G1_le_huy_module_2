package case_study.furama_resort.model;

public abstract class Facility {
    private String code; //code of service
    private String name; // name of service
    private float area; //usage area
    private int fee;
    private int occupancy; //maximum guest
    private String rentalType; //types of rent: yearly, monthly, daily, hourly

    public Facility() {
    }

    public Facility(String code, String name, float area, int fee, int occupancy, String rentalType) {
        this.code = code;
        this.name = name;
        this.area = area;
        this.fee = fee;
        this.occupancy = occupancy;
        this.rentalType = rentalType;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public int getOccupancy() {
        return occupancy;
    }

    public void setOccupancy(int occupancy) {
        this.occupancy = occupancy;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }
}
