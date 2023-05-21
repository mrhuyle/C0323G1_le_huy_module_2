package additional_exercise.model;

public class Teacher extends Person{
    private String subject = new String();

    public Teacher(String id, String name, String birthdate, boolean gender, String subject) {
        super(id, name, birthdate, gender);
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Giảng viên {" +
                super.toString()+
                ", chuyên môn='" + subject + '\'' +
                '}';
    }
}
