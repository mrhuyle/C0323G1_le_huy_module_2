package additional_exercise.repository.interface_;

import additional_exercise.model.Person;

import java.util.ArrayList;
import java.util.List;

public interface IStudentManagementRepository {
    List<Person> getAll();
    void addPerson(Person person);
    void deletePerson(Person person);
    Person getPersonById(String id);
    static List<Person> readFileCsv(String filePath) {
        List<Person> list = new ArrayList<>();
        return list;
    }
    void writeFileCsv(String filePath);
    void getInfor();
    boolean checkIdStudentFormat(String id);
    boolean checkIdTeacherFormat(String id);
    boolean checkDateFormat(String date);
    boolean checkClassNameFormat (String className);
}
