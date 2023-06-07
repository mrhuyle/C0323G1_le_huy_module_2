package case_study.furama_resort.repository.implement_;

import case_study.furama_resort.model.Booking;

import java.time.LocalDate;
import java.util.Comparator;

public class BookingComparator implements Comparator<Booking> {
    @Override
    public int compare(Booking o1, Booking o2) {
        if (!LocalDate.parse(o1.getDateBook()).equals(LocalDate.parse(o2.getDateBook()))) {
            return LocalDate.parse(o1.getDateBook()).compareTo(LocalDate.parse(o2.getDateBook()));
        } else {
            return LocalDate.parse(o1.getEndDateRent()).compareTo(LocalDate.parse(o2.getEndDateRent()));
        }
    }
}
