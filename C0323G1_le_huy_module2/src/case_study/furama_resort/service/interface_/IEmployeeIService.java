package case_study.furama_resort.service.interface_;

public interface IEmployeeIService extends IService {
    @Override
    default void displayList() {
    }
    void add();

    void edit();
}
