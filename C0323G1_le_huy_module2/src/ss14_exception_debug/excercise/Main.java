package ss14_exception_debug.excercise;

import java.util.Scanner;

/**
 * Author: Le Huy
 * Description: Practice using Exception by custom IllegalTriangleException.
 * Notice: how to make a custom exception class, using "throws", try - catch.
 */
public class Main {
    public static void main(String[] args) {
        //Input three sides of triangle:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input three sides of triangle");
        int firstSide = 0;
        int secondSide = 0;
        int thirdSide = 0;
        do {
            try {
                System.out.println("First side: ");
                firstSide = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Wrong number format. Input again");
            }
        } while (true);
        do {
            try {
                System.out.println("Second side: ");
                secondSide = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Wrong number format. Input again");
            }
        } while (true);
        do {
            try {
                System.out.println("Third side: ");
                thirdSide = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Wrong number format. Input again");
            }
        } while (true);

        //Check property of the triangle:
        try {
            checkTriangle(firstSide, secondSide, thirdSide);
        } catch (IllegalTriangleException illegalTriangleException) {
            System.out.println(illegalTriangleException.getMessage());
        }
    }

    public static void checkTriangle(int a, int b, int c) throws IllegalTriangleException {
        if (a + b < c || a + c < b || b + c < a) {
            throw new IllegalTriangleException("Three sides do not match properties of a triangle");
        } else if (a < 0 || b < 0 || c < 0) {
            throw new IllegalTriangleException("Sides has negative number");
        } else {
            System.out.println("The triangle with three sides: " + a + "," + b + "," + c + " has been created");
        }
    }
}
