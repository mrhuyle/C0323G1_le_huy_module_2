package case_study.furama_resort.service.interface_;

public interface IBookingService extends IService {
    @Override
    default void displayList() {

    }
    void add();
}
