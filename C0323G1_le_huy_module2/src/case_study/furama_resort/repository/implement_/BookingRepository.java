package case_study.furama_resort.repository.implement_;

import case_study.furama_resort.model.Booking;
import case_study.furama_resort.repository.interface_.IBookingRepository;

import java.util.List;

public class BookingRepository implements IBookingRepository {
    @Override
    public List<Booking> getAll() {
        return IBookingRepository.super.getAll();
    }

    @Override
    public void add(Booking T) {
        IBookingRepository.super.add(T);
    }

    @Override
    public void delete(Booking T) {
        IBookingRepository.super.delete(T);
    }
}
