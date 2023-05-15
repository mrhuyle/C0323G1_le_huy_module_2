package ss6_inheritance.exercise.triangle;

public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {

    }

    public Triangle(double side1, double side2, double side3, String color) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public double getSemiPerimeter() {
        return getPerimeter() / 2;
    }

    public double getArea() {
        double s = getSemiPerimeter();
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public String toString() {
        return "A triangle has 3 sides "
                + getSide1() + ", " + getSide2() + ", " + getSide3() + ". "
                + "It has perimeter = " + getPerimeter()
                + " , area = " + getArea()
                + ". It is a subclass of " + super.toString();
    }
}
