package ss2_array_loop.exercise;

import java.util.Scanner;

public class PrintShapes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle: bottom-left");
            System.out.println("3. Print the square triangle: top-left");
            System.out.println("4. Print the square triangle: top-right");
            System.out.println("5. Print the square triangle: bottom-right");
            System.out.println("6. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1. Print the rectangle");
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 10; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.println("2. Print the square triangle: bottom-left");
                    for (int i = 0; i < 10; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    System.out.println("3. Print the square triangle: top-left");
                    for (int i = 0; i < 10; i++) {
                        for (int j = 10; j > i; j--) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 4:
                    System.out.println("4. Print the square triangle: top-right");
                    for (int i = 0; i < 10; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("  ");
                        }
                        for (int j = 10; j > i; j--) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 5:
                    System.out.println("5. Print the square triangle: bottom-right");
                    for (int i = 0; i < 10; i++) {
                        for (int j = 10; j > i; j--) {
                            System.out.print("  ");
                        }
                        for (int j = 0; j < i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 6:
                    System.out.println("6. Print isosceles triangle");
                    for (int i = 0; i < 10; i++) {
                        for (int j = 0; j < 10-i; j++) {
                            System.out.print("  ");
                        }
                        for (int j = 0; j < 2*i+1; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
