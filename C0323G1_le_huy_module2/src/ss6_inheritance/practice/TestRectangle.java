package ss6_inheritance.practice;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(3,6);
        System.out.println(rectangle);
        rectangle = new Rectangle(10,20,"gray",false);
        System.out.println(rectangle);
    }
}
