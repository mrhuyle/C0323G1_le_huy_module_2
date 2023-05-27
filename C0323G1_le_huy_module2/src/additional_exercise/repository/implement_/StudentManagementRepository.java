package additional_exercise.repository.implement_;

import additional_exercise.model.Person;
import additional_exercise.model.Student;
import additional_exercise.model.Teacher;
import additional_exercise.repository.interface_.IStudentManagementRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentManagementRepository implements IStudentManagementRepository {
    private static List<Person> personList = readFileCsv("src/additional_exercise/repository/person.csv");

//    static {
//        personList.add(new Student("S001", "Le Huy", "20/06/1989", true, "C0323G1", 9.5f));
//        personList.add(new Student("S002", "Nguyen Thi B", "01/01/1999", false, "C0423G1", 8.5f));
//        personList.add(new Teacher("T003", "Louis Le", "20/06/1979", true, "Java"));
//    }

    @Override
    public List<Person> getAll() {
        return personList;
    }

    @Override
    public void addPerson(Person person) {
        personList.add(person);
    }

    @Override
    public void deletePerson(Person person) {
        personList.remove(person);
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

    public static List<Person> readFileCsv(String filePath) {
        List<Person> newPersonList = new ArrayList<>();
        try {
            File file = new File(filePath);
            FileReader fileReader = new FileReader(file);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] arrString = line.split(",");
                if (arrString.length == 6) {
                    Person newStudent = new Student(arrString[0], arrString[1], arrString[2], Boolean.getBoolean(arrString[3]), arrString[4], Float.parseFloat(arrString[5]));
                    newPersonList.add(newStudent);
                } else if (arrString.length == 5) {
                    Person newTeacher = new Teacher(arrString[0], arrString[1], arrString[2], Boolean.getBoolean(arrString[3]), arrString[4]);
                    newPersonList.add(newTeacher);
                }
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return newPersonList;
    }
}
