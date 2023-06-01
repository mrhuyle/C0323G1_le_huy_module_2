package case_study.furama_resort.repository.interface_;

import java.util.List;

public interface IRepository<T> {
    List<T> getAll();

    void add(T T);
}
