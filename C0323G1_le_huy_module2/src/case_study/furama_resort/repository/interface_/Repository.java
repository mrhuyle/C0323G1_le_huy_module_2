package case_study.furama_resort.repository.interface_;

import java.util.List;

public interface Repository<T> {
    List<T> getAll();
}
