package ss6_inheritance.exercise.circle_and_cylinder;

public class TestCylinder {
    public static void main(String[] agrs) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(10.2, "red", 20.50);
        System.out.println(cylinder);
    }
}
