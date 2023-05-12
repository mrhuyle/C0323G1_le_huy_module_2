package ss5_access_modifier.exercise.access_modifier;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        //Create a circle with no radius, input radius and print the result
        Circle circleNoRadius = new Circle();
        System.out.println("You've created the circle 1 with no radius");
        System.out.println("Input this radius: ");
        Scanner scanner = new Scanner(System.in);
        circleNoRadius.setRadius(Double.parseDouble(scanner.nextLine()));
        System.out.println(circleNoRadius.toString());
        System.out.println("The area of Circle 1 = " + circleNoRadius.getArea());

        //Create a circle with radius euqals 4 via constructor, print the result
        System.out.println("");
        Circle circleHasRadius = new Circle(4);
        System.out.println("You've created the circle 2 with radius equals 4 via constructor");
        System.out.println(circleHasRadius.toString());
        System.out.println("The area of Circle 2 = " + circleHasRadius.getArea());

        //Create a default circle, print the result
        System.out.println("");
        Circle circleDefault = new Circle();
        System.out.println("You've created the default circle");
        System.out.println(circleDefault.toString());
        System.out.println("The area of Circle Default = " + circleDefault.getArea());
    }
}
