package case_study.furama_resort.service.interface_;

public interface IEmployeeService extends Service{
    @Override
    default void displayList() {
    }
    void add();
}
