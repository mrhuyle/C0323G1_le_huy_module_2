package ss15_io_text_file.exercise.copy_file_text;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFileText {

    public List<Character> readFileText(String filePath) {
        List<Character> characterList = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) != ' ')
                        characterList.add(line.charAt(i));
                }
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException ioException) {
            System.out.println("IO Exception (File not Found or errors else (check stack trace)");
            ioException.printStackTrace();
        }
        return characterList;
    }

    public int writeFileText(String filePath, List<Character> characterList) {
        int countChar = 0;
        File file = new File(filePath);
        if (file.exists()) {
            throw new RuntimeException("File is exist");
        }
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < characterList.size(); i++) {
                if (characterList.get(i) != ' ') {
                    bufferedWriter.write(characterList.get(i));
                    countChar++;
                    bufferedWriter.newLine();
                }
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException ioException) {
            System.out.println("IO Exception (check stack trace)");
            ioException.printStackTrace();
        }
        return countChar;
    }
}
