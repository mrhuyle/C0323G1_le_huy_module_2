package ss15_io_text_file.exercise.read_file_csv;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ReadFileCsv readFileCsv = new ReadFileCsv();
        Set<Nation> nationList = new LinkedHashSet<>();
        nationList = readFileCsv.readFileCsv("src/ss15_io_text_file/exercise/read_file_csv/nationList.csv");
        for (Nation nation: nationList) {
            System.out.println(nation.getNationInfo());
        }
    }
}
