package ss6_inheritance.exercise.circle_and_cylinder;

class Cylinder extends Circle {
    private double height = 2.0;

    public Cylinder() {

    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return Math.PI * getRadius() * getRadius() * getHeight();
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * (getRadius() * getRadius() + getRadius() * getHeight());
    }

    @Override
    public String toString() {
        return "A Cylinder has radius = "
                + getRadius()
                + " , height = "
                + getHeight()
                + " , area = "
                + getArea()
                + " , volume = "
                + getVolume()
                + " and is a subclass of a Circle";
    }
}
