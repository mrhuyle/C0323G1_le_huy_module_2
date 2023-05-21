package addtitional_exercise.model;

public class Student extends Person{
    private String className = new String();
    private float score;

    public Student(String id, String name, String birthdate, boolean gender, String className, float score) {
        super(id, name, birthdate, gender);
        this.className = className;
        this.score = score;
    }
}
