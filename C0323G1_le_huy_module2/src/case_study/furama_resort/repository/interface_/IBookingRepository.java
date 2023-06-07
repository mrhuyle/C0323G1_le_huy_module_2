package case_study.furama_resort.repository.interface_;

import case_study.furama_resort.model.Booking;

import java.util.List;
import java.util.TreeSet;

public interface IBookingRepository{
    TreeSet<Booking> getAll();

    void add(Booking booking);

    String getInfo(Booking booking);
}
