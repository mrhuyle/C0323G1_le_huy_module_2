package additional_exercise.repository.implement_;

import additional_exercise.common.ReadWriteFileCsv;
import additional_exercise.model.Person;
import additional_exercise.repository.interface_.IStudentManagementRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentManagementRepository implements IStudentManagementRepository {
    private static List<Person> personList = new ArrayList<>();

    @Override
    public List<Person> getAll() {
        personList = ReadWriteFileCsv.readFileCsv();
        return personList;
    }

    @Override
    public void addPerson(Person person) {
        personList = ReadWriteFileCsv.readFileCsv();
        personList.add(person);
        ReadWriteFileCsv.writeFileCsv(personList);

    }

    @Override
    public void deletePerson(Person person) {
        personList = ReadWriteFileCsv.readFileCsv();
        personList.remove(person);
        ReadWriteFileCsv.writeFileCsv(personList);
    }

    @Override
    public Person getPersonById(String id) {
        personList = ReadWriteFileCsv.readFileCsv();
        for (Person person : personList) {
            if (person.getId().equals(id)) {
                return person;
            }
        }
        return null;
    }

    public void getInfor() {
        personList = ReadWriteFileCsv.readFileCsv();
        for (Person person : personList) {
            System.out.println(person.getInfo());
        }
    }
}
