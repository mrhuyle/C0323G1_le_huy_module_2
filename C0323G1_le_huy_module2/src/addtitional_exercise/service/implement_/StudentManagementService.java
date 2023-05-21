package addtitional_exercise.service.implement_;

import addtitional_exercise.model.Person;
import addtitional_exercise.repository.implement_.StudentManagementRepository;
import addtitional_exercise.repository.interface_.IStudentManagementRepository;
import addtitional_exercise.service.interface_.IStudentManagementService;

import java.util.List;

public class StudentManagementService implements IStudentManagementService {
    private IStudentManagementRepository studentManagementRepository = new StudentManagementRepository();

    @Override
    public void addStudentTeacher() {

    }

    @Override
    public void displayAll() {
        List<Person> personList = studentManagementRepository.getAll();
        for (Person person: personList) {
            System.out.println(person);
        }
    }

    @Override
    public void deleteStudentTeacher() {

    }
}
