package ss15_io_text_file.exercise.read_file_csv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileCsv {
    public List<Nation> readFileCsv(String filePath) {
        List<Nation> nationList = new ArrayList<>();
        File file = new File(filePath);
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] arrNationInfo = line.split(",");
                Nation nation = new Nation(Integer.parseInt(arrNationInfo[0]), arrNationInfo[1], arrNationInfo[2]);
                nationList.add(nation);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return nationList;
    }
}