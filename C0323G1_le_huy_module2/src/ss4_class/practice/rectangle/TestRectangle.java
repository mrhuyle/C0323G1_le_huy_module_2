package ss4_class.practice.rectangle;

import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width: ");
        double width = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the height: ");
        double height = Double.parseDouble(scanner.nextLine());
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your rectangle is: " + rectangle.display());
        System.out.println("This area is: " + rectangle.getArea());
        System.out.println("This perimeter is: " + rectangle.getPerimeter());
    }
}
