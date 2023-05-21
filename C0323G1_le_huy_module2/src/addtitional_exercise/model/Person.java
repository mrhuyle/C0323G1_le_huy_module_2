package addtitional_exercise.model;

public abstract class Person {
    private String id = new String();
    private String name = new String();
    private String birthdate = new String();
    private boolean gender;

    public Person(String id, String name, String birthdate, boolean gender) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}
