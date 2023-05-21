package addtitional_exercise.repository.implement_;

import addtitional_exercise.model.Person;
import addtitional_exercise.model.Student;
import addtitional_exercise.model.Teacher;
import addtitional_exercise.repository.interface_.IStudentManagementRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentManagementRepository implements IStudentManagementRepository {
    private static List<Person> personList = new ArrayList<>();

    //Student(String id, String name, String birthdate, boolean gender, String className, float score)
    //Teacher(String id, String name, String birthdate, boolean gender, String subject)
    static {
        personList.add(new Student("S001","Le Huy","20/06/1989",true,"C0323G1",9.5f));
        personList.add(new Student("S002","Nguyen Thi B","01/01/1999",false,"C0423G1",8.5f));
        personList.add(new Teacher("T003","Louis Le","20/06/1979",true,"Java"));
    }

    @Override
    public List<Person> getAll() {
        return personList;
    }
}
