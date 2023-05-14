package ss6_inheritance.exercise.circle_and_cylinder;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(4.0,"yellow");
        System.out.println(circle);
    }
}
