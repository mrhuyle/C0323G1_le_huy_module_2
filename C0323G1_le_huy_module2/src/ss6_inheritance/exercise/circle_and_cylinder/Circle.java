package ss6_inheritance.exercise.circle_and_cylinder;

class Circle {
    private double radius = 1.0;
    private String color = "blue";

    public Circle() {

    }

    public Circle(double radius, String color) {
        this.color = color;
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    private double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle has radius = "
                + getRadius()
                + " , area = "
                + getArea()
                + ", perimeter = "
                + getPerimeter();
    }
}
