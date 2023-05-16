package ss7_abstract_interface.exercise.interface_resizeable_colorable;

public abstract class Shapes implements Resizeable {
    String color = "green";
    boolean filled = true;

    public Shapes() {

    }

    public Shapes(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return this.color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }
    @Override
    public void resize(double percent) {
        System.out.println("Area of shape = ");;
    }
    public abstract double getArea();
}
