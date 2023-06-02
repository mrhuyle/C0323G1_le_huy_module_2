package case_study.furama_resort.repository.interface_;

import case_study.furama_resort.model.Booking;

import java.util.List;

public interface IBookingIRepository extends IRepository <Booking> {
    @Override
    default List<Booking> getAll() {
        return null;
    }

    @Override
    default void add(Booking T) {

    }

    @Override
    default void delete(Booking T) {

    }
}
