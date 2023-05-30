package ss16_io_binary_file_serialization.exercise.product_management.controller;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile<T> {
    public List<T> readFromFile(String path) {
        List<T> list = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            list = (List<T>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");;
        } catch (IOException e) {
            System.out.println("IO Error");;
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");;
        }
        return list;
    }
    public void writeToFile(String path, List<T> list) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(list);
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");;
        } catch (IOException e) {
            System.out.println("IO Error");;
        }
    }
}
