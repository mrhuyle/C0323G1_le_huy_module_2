package ss6_inheritance.exercise.triangle;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Declare 3 sides of triangle and input its color
        double side1 = 0.0;
        double side2 = 0.0;
        double side3 = 0.0;
        System.out.println("Input color");
        String color = scanner.nextLine();

        //Check the condition of a triangle, if wrong input again
        boolean checkBegin = true; // checkBegin: a condition of first statement at line 19
        do {
            if (!checkBegin) {
                System.out.println("Do not exist triangle with these sides. Input again:");
            }
            do {
                System.out.println("Input side1 must be greater than 0");
                side1 = Double.parseDouble(scanner.nextLine());
            } while (side1 <= 0);
            do {
                System.out.println("Input side2 must be greater than 0");
                side2 = Double.parseDouble(scanner.nextLine());
            } while (side2 <= 0);
            do {
                System.out.println("Input side3 must be greater than 0");
                side3 = Double.parseDouble(scanner.nextLine());
            } while (side3 < 0);
            checkBegin = false;
        }
        while ((side1 + side2) < side3 || (side1 + side3) < side2 || (side3 + side2) < side1);

        //Creat the triangle with constructor method
        Triangle triangle = new Triangle(side1, side2, side3, color);
        System.out.println(triangle);
    }
}
