package case_study.furama_resort.model;

import java.util.Objects;

public class Booking {
    private String code;
    private String dateBook;
    private String beginDateRent;
    private String endDateRent;
    private Customer customer;
    private Facility facility;

    public Booking() {
    }

    public Booking(String code, String dateBook, String beginDateRent, String endDateRent, Customer customer, Facility facility) {
        this.code = code;
        this.dateBook = dateBook;
        this.beginDateRent = beginDateRent;
        this.endDateRent = endDateRent;
        this.customer = customer;
        this.facility = facility;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDateBook() {
        return dateBook;
    }

    public void setDateBook(String dateBook) {
        this.dateBook = dateBook;
    }

    public String getBeginDateRent() {
        return beginDateRent;
    }

    public void setBeginDateRent(String beginDateRent) {
        this.beginDateRent = beginDateRent;
    }

    public String getEndDateRent() {
        return endDateRent;
    }

    public void setEndDateRent(String endDateRent) {
        this.endDateRent = endDateRent;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return Objects.equals(code, booking.code) && Objects.equals(dateBook, booking.dateBook) && Objects.equals(beginDateRent, booking.beginDateRent) && Objects.equals(endDateRent, booking.endDateRent) && Objects.equals(customer, booking.customer) && Objects.equals(facility, booking.facility);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, dateBook, beginDateRent, endDateRent, customer, facility);
    }

    @Override
    public String toString() {
        return ">>> Booking:" +
                " code = " + code +
                ", dateBook = " + dateBook +
                ", beginDateRent = " + beginDateRent +
                ", endDateRent = " + endDateRent +
                ", customerCode = " + customer.getCode() +
                ", facilityCode = " + facility.getCode();
    }
}
