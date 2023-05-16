package ss7_abstract_interface.exercise.interface_resizeable;

public class TestColorable {
    public static void main(String[] args) {
        Shapes[] shapes = new Shapes[3];
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        shapes[0] = circle;
        shapes[1] = rectangle;
        shapes[2] = square;
        for (Shapes shape : shapes) {
            if (shape instanceof Colorable) {
                System.out.print(shape.getArea() + " , ");
                ((Colorable) shape).howToColor();
            } else {
                System.out.println(shape.getArea());
            }
        }
    }
}
