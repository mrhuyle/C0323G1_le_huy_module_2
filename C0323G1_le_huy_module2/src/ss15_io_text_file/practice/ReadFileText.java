package ss15_io_text_file.practice;
import java.io.*;
import java.util.Scanner;

public class ReadFileText {
    public static void main(String[] args) {
        System.out.println("Input file path");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        ReadFileText readFileText = new ReadFileText();
        readFileText.readFileText(path);
    }
    public void readFileText(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            int sum = 0;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            bufferedReader.close();
            System.out.println("Sum = " + sum);
        } catch (Exception e) {
            System.out.println("File not Found or something else");;
        }
    }
}
