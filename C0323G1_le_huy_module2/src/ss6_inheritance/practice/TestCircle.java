package ss6_inheritance.practice;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println(circle1);
        Circle circle2 = new Circle(2);
        System.out.println(circle2);
        Circle circle3 = new Circle(3,"blue",false);
        System.out.println(circle3);
    }

}
