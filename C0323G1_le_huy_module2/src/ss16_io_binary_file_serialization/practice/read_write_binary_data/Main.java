package ss16_io_binary_file_serialization.practice.read_write_binary_data;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeDataToFile(String path, List<Student> students) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(students);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public static List<Student> readDateFromFile(String path) {
        List<Student> students = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            students = (List<Student>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;

    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Le Huy", "Da Nang"));
        students.add(new Student(2, "Huy Le", "Quang Nam"));
        students.add(new Student(3, "Louis Le", "American"));
        writeDataToFile("src/ss16_io_binary_file_serialization/practice/read_write_binary_data/students.txt", students);

        List<Student> studentListFromFile = readDateFromFile("src/ss16_io_binary_file_serialization/practice/read_write_binary_data/students.txt");
        for (Student student: studentListFromFile) {
            System.out.println(student);
        }
    }
}
