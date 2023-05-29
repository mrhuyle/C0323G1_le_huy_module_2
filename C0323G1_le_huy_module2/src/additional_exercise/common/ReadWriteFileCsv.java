package additional_exercise.common;

import additional_exercise.model.Person;
import additional_exercise.model.Student;
import additional_exercise.model.Teacher;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFileCsv {
    public static final String FILE_PATH = "src/additional_exercise/data/person.csv";
    public static List<Person> readFileCsv() {
        List<Person> newPersonList = new ArrayList<>();
        try {
            File file = new File(FILE_PATH);
            FileReader fileReader = new FileReader(file);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] arrString = line.split(",");
                if (arrString.length == 6) {
                    Person newStudent = new Student(arrString[0], arrString[1], arrString[2], Boolean.parseBoolean(arrString[3]), arrString[4], Float.parseFloat(arrString[5]));
                    newPersonList.add(newStudent);
                } else if (arrString.length == 5) {
                    Person newTeacher = new Teacher(arrString[0], arrString[1], arrString[2], Boolean.parseBoolean(arrString[3]), arrString[4]);
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

    public static void writeFileCsv(List<Person> personList) {
        try {
            File file = new File(FILE_PATH);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Person person: personList) {
                bufferedWriter.write(person.getInfo());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Không tìm thấy file");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
