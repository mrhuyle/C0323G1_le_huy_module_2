package additional_exercise.model;

public class Student extends Person{
    private String className = new String();
    private float score;

    public Student() {
    }

    public Student(String id, String name, String birthdate, boolean gender, String className, float score) {
        super(id, name, birthdate, gender);
        this.className = className;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Sinh viên {" +
                super.toString() +
                ", lớp='" + className + '\'' +
                ", điểm=" + score +
                '}';
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    @Override
    public String getInfo() {
        return getId() + "," + getName() + "," + getBirthdate() + "," + isGender() + ","
                + getClassName() + "," + getScore();
    }
}
