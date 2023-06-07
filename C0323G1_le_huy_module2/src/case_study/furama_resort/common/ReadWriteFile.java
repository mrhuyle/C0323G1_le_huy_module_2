package case_study.furama_resort.common;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList = readFile("src/case_study/furama_resort/data/employee");
        for (String str : stringList) {
            System.out.println(str);
        }
    }

    public static List<String> readFile(String path) {
        List<String> stringList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Error in input ouput data");
        }
        return stringList;
    }

    public static void writeFile(String path, List<String> stringlist, boolean append) {
        try {
            FileWriter fileWriter = new FileWriter(path,append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for(String str: stringlist) {
                if (str != null ) {
                    bufferedWriter.write(str);
                    bufferedWriter.newLine();
                }
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.err.println("Error in input ouput data");
        }
    }
}
