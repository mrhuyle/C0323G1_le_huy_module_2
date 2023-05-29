package additional_exercise.repository.implement_;

import additional_exercise.common.ReadWriteFileCsv;
import additional_exercise.model.Person;
import additional_exercise.repository.interface_.IStudentManagementRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentManagementRepository implements IStudentManagementRepository {
    private static List<Person> personList = new ArrayList<>();

//    static {
//        personList.add(new Student("S001", "Le Huy", "20/06/1989", true, "C0323G1", 9.5f));
//        personList.add(new Student("S002", "Nguyen Thi B", "01/01/1999", false, "C0423G1", 8.5f));
//        personList.add(new Teacher("T003", "Louis Le", "20/06/1979", true, "Java"));
//    }

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
        for (Person person : personList) {
            if (person.getId().equals(id)) {
                return person;
            }
        }
        return null;
    }

    public void getInfor() {
        for (Person person : personList) {
            System.out.println(person.getInfo());
        }
    }

    @Override
    public boolean checkIdStudentFormat(String id) {
        String pattern = "^S\\d{3}$";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(id);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean checkIdTeacherFormat(String id) {
        String pattern = "^T\\d{3}$";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(id);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean checkDateFormat(String date) {
        String pattern = "^\\d{2}/\\d{2}/\\d{4}$";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(date);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean checkClassNameFormat(String className) {
        String pattern = "^[CA]\\d{2}$";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(className);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean checkIdDuplicate(String id) {
        for (Person person : personList) {
            if (person.getId().equals(id)) {
                return false;
            }
        }
        return true;
    }
}
