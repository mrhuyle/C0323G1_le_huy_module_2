package case_study.furama_resort.model;

public class Customer extends Person {
    private String type; //type of customer: Diamond, Platinum, Gold, Silver
    private String address;

    public Customer() {
    }

    public Customer(String code, String name, String birthdate, boolean gender, String id, String phoneNumber, String email, String type, String address) {
        super(code, name, birthdate, gender, id, phoneNumber, email);
        this.type = type;
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "*** Customer: " +
                super.toString() +
                ", type= " + type +
                ", address= " + address;
    }
}
