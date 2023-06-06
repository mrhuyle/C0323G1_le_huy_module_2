package case_study.furama_resort.model;

public class Employee extends Person {
    private String academicLevel;
    private String position;
    private float salary;

    public Employee() {
    }

    public Employee(String code, String name, String birthdate, boolean gender, String id, String phoneNumber, String email, String academicLevel, String position, float salary) {
        super(code, name, birthdate, gender, id, phoneNumber, email);
        this.academicLevel = academicLevel;
        this.position = position;
        this.salary = salary;
    }

    public String getAcademicLevel() {
        return academicLevel;
    }

    public void setAcademicLevel(String academicLevel) {
        this.academicLevel = academicLevel;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return ">>> Employee: " + super.toString()
                + ", academicLevel = " + academicLevel
                + ", postion = " + position
                + ", salary = $ " + salary;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
