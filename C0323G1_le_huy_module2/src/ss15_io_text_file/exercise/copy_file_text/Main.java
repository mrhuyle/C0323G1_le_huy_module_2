package ss15_io_text_file.exercise.copy_file_text;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Le Huy
 * Description: Practice input stream and output stream with copy and
 */
public class Main {
    public static void main(String[] args) {
        //Read file test.txt in package:
        List<Character> characters = new ArrayList<>();
        ReadAndWriteFileText readAndWriteFileText = new ReadAndWriteFileText();
        characters = readAndWriteFileText.readFileText("src/ss15_io_text_file/exercise/copy_file_text/test.text");
        System.out.println("Number of characters in test.txt file is (details in new.txt file) : " + readAndWriteFileText.writeFileText("src/ss15_io_text_file/exercise/copy_file_text/new.txt", characters));
    }
}
