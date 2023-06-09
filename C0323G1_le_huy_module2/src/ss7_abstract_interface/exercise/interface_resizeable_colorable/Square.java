package ss7_abstract_interface.exercise.interface_resizeable_colorable;

public class Square extends Rectangle implements Resizeable,Colorable {
    public Square() {

    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        this.setWidth(side);
        this.setLength(side);
    }
    @Override
    public String toString() {
        return "A Square with side = "
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        setSide(getSide() * (1 + (percent / 100)));
        System.out.println("Area of square = " + getArea());
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
