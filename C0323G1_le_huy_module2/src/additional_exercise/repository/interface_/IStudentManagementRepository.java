package additional_exercise.repository.interface_;

import additional_exercise.model.Person;

import java.util.List;

public interface IStudentManagementRepository {
    List<Person> getAll();
    void addPerson(Person person);
    void deletePerson(Person person);
    Person getPersonById(String id);
}
