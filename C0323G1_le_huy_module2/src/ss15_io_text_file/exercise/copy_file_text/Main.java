package ss15_io_text_file.exercise.copy_file_text;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Le Huy
 * Description: Practice input stream and output stream by reading data from an existing file (test.txt) and writing it to a new file.
 * Notice: Diplay number of characters from a string in an existing file.
 * Classes related: ReadAndWriteFileText class have 2 methods: readFileText(String filePath) and writeFileText(String filePath, List<Character> characterList)
 */
public class Main {
    public static void main(String[] args) {
        //Read file test.txt in package:
        List<Character> characters = new ArrayList<>();
        ReadAndWriteFileText readAndWriteFileText = new ReadAndWriteFileText();
        characters = readAndWriteFileText.readFileText("src/ss15_io_text_file/exercise/copy_file_text/test.txt");
        System.out.println("Number of characters in test.txt file is (details in new.txt file) : " + readAndWriteFileText.writeFileText("src/ss15_io_text_file/exercise/copy_file_text/new.txt", characters));
    }
}
