package ss7_abstract_interface.exercise.interface_resizeable;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TestResizeable {
    public static void main(String[] args) {
        Shapes[] shapes = new Shapes[3];
        Circle circle = new Circle(5, "gray", false);
        Rectangle rectangle = new Rectangle(2, 4, "pink", true);
        Square square = new Square(10, "black", true);
        shapes[0] = circle;
        shapes[1] = rectangle;
        shapes[2] = square;
        System.out.println("Before resize method:");
        for (Shapes shape : shapes) {
            System.out.println(shape);
        }
        System.out.println("Input percent to change the dimensions of shapes " +
                "% (from 1 to 100)");
        Scanner scanner = new Scanner(System.in);
        double percent = Double.parseDouble(scanner.nextLine());
        System.out.println("After resize " + percent + " % method: ");
        for (Shapes shape : shapes) {
            shape.resize(percent);
        }
    }
}
