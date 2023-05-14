package ss6_inheritance.practice;

public class TestSquare {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);
        square = new Square(10);
        System.out.println(square);
        square = new Square(20,"yellow", false);
        System.out.println(square);
    }
}
