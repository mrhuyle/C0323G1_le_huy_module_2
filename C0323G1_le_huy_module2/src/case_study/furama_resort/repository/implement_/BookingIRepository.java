package case_study.furama_resort.repository.implement_;

import case_study.furama_resort.model.Booking;
import case_study.furama_resort.repository.interface_.IBookingIRepository;

import java.util.List;

public class BookingIRepository implements IBookingIRepository {
    @Override
    public List<Booking> getAll() {
        return IBookingIRepository.super.getAll();
    }

    @Override
    public void add(Booking T) {
        IBookingIRepository.super.add(T);
    }

    @Override
    public void delete(Booking T) {
        IBookingIRepository.super.delete(T);
    }
}
