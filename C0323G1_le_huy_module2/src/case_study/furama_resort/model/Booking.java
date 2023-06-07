package case_study.furama_resort.model;

public class Booking {
    private String code;
    private String dateBook;
    private String beginDateRent;
    private String endDateRent;
    private String customerCode;
    private String facilityCode;

    public Booking() {
    }

    public Booking(String code, String dateBook, String beginDateRent, String endDateRent, String customerCode, String facilityCode) {
        this.code = code;
        this.dateBook = dateBook;
        this.beginDateRent = beginDateRent;
        this.endDateRent = endDateRent;
        this.customerCode = customerCode;
        this.facilityCode = facilityCode;
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

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getFacilityCode() {
        return facilityCode;
    }

    public void setFacilityCode(String facilityCode) {
        this.facilityCode = facilityCode;
    }
}
