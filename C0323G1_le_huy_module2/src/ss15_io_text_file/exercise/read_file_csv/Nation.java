package ss15_io_text_file.exercise.read_file_csv;

public class Nation {
    private int id;
    private String code;
    private String nationName;

    public Nation() {

    }

    public Nation(int id, String code, String nationName) {
        this.id = id;
        this.code = code;
        this.nationName = nationName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNationName() {
        return nationName;
    }

    public void setNationName(String nationName) {
        this.nationName = nationName;
    }

    public String getNationInfo() {
        return "Nation ID: " + getId() + " , "
                + "Nation Code: " + getCode() + " , "
                + "Nation Name: " + getNationName();
    }
}
