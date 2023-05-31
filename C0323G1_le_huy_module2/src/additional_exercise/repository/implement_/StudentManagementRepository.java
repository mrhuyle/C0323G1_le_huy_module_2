package additional_exercise.repository.implement_;

import additional_exercise.common.ReadWriteFileCsv;
import additional_exercise.model.Person;
import additional_exercise.model.Student;
import additional_exercise.model.Teacher;
import additional_exercise.repository.interface_.IStudentManagementRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentManagementRepository implements IStudentManagementRepository {
    private static final String PERSON_PATH = "src/additional_exercise/data/person.csv";
    private static List<Person> personList = new ArrayList<>();

    @Override
    public List<Person> getAll() {
        List<String> stringsFromFile = new ArrayList<>();
        stringsFromFile = ReadWriteFileCsv.readFileCsvToString(PERSON_PATH);
        personList.clear();
        for (String dataLine: stringsFromFile) {
            String [] personData = dataLine.split(",");
            if (personData[0].charAt(0) == 'S') {
                Person newStudent = new Student(personData[0],personData[1],personData[2],Boolean.parseBoolean(personData[3]),personData[4],Float.parseFloat(personData[5]));
                personList.add(newStudent);
            } else if (personData[0].charAt(0) == 'T') {
                Person newTeacher = new Teacher(personData[0],personData[1],personData[2],Boolean.parseBoolean(personData[3]),personData[4]);
                personList.add(newTeacher);
            }
        }
        return personList;
    }

    @Override
    public void addPerson(Person person) {
        personList = getAll();
        personList.add(person);
        ReadWriteFileCsv.writeFileCsv(personList);
    }

    @Override
    public void deletePerson(Person person) {
        personList = getAll();
        personList.remove(person);
        ReadWriteFileCsv.writeFileCsv(personList);
    }

    @Override
    public Person getPersonById(String id) {
        personList = getAll();
        for (Person person : personList) {
            if (person.getId().equals(id)) {
                return person;
            }
        }
        return null;
    }

    public void getInfor() {
        personList = getAll();
        for (Person person : personList) {
            System.out.println(person.getInfo());
        }
    }
}
