package ss3_array_method.exercise;

import java.util.Scanner;

public class FindMaxElementIn2DimArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a row and a collumn of a array");
        System.out.println("Input row index: ");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Input collumn index: ");
        int col = Integer.parseInt(scanner.nextLine());
        int[][] arrayInt = new int[row][col];
        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = 0; j < arrayInt[i].length; j++) {
                System.out.println("Input the element that has index " + i + j);
                arrayInt[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        int max = arrayInt[0][0];
        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = 0; j < arrayInt[i].length; j++) {
                if (arrayInt[i][j] > max) {
                    max = arrayInt[i][j];
                }
            }
        }
        System.out.println("The max element is: " + max);
    }
}

