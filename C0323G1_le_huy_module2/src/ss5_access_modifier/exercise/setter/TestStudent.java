package ss5_access_modifier.exercise.setter;

import ss5_access_modifier.exercise.access_modifier.Circle;

public class TestStudent {
    public static void main(String[] args) {
        Student studentDefault = new Student();
        System.out.println(studentDefault.toString());
        Student student1 = new Student();
        student1.setName("Huy");
        student1.setClasses("C0323G1");
        System.out.println(student1.toString());
        Circle circle = new Circle();
    }
}
