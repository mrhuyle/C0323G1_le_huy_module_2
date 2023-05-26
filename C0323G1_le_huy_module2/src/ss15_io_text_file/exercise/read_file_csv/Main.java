package ss15_io_text_file.exercise.read_file_csv;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReadFileCsv readFileCsv = new ReadFileCsv();
        List<Nation> nationList = new ArrayList<>();
        nationList = readFileCsv.readFileCsv("src/ss15_io_text_file/exercise/read_file_csv/nationList.csv");
        for (Nation nation: nationList) {
            System.out.println(nation.getNationInfo());
        }
    }
}
