package ss15_io_text_file.practice;

import java.util.List;

public class FindMaxValue {
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("src/ss15_io_text_file/practice/numbers.txt");
        int max = findMaxValue(numbers);
        readAndWriteFile.writeFile("src/ss15_io_text_file/practice/numbers.txt", max);
    }

    public static int findMaxValue(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }
        return max;
    }
}
