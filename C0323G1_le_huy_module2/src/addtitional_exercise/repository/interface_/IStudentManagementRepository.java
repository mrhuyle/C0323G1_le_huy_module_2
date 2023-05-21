package addtitional_exercise.repository.interface_;

import addtitional_exercise.model.Person;

import java.util.List;

public interface IStudentManagementRepository {
    List<Person> getAll();
    void addPerson(Person person);
    void deletePerson(Person person);
    Person getPersonById(String id);
}
