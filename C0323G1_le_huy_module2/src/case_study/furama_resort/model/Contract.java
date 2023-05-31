package case_study.furama_resort.model;

public class Contract {
    private String contactNumber;
    private String bookingCode;
    private float deposit;
    private float totalFee;

    public Contract() {
    }

    public Contract(String contactNumber, String bookingCode, float deposit, float totalFee) {
        this.contactNumber = contactNumber;
        this.bookingCode = bookingCode;
        this.deposit = deposit;
        this.totalFee = totalFee;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public float getDeposit() {
        return deposit;
    }

    public void setDeposit(float deposit) {
        this.deposit = deposit;
    }

    public float getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(float totalFee) {
        this.totalFee = totalFee;
    }
}
