package ss3_array_method.exercise;

import java.util.Scanner;

public class SumOfCollumnArray {
    public static void main(String[] args) {
        //Make a array
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a row and a collumn of a array");
        System.out.println("Input row index of array: ");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Input collumn index of array: ");
        int col = Integer.parseInt(scanner.nextLine());
        double[][] arrDouble = new double[row][col];
        for (int i = 0; i < arrDouble.length; i++) {
            for (int j = 0; j < arrDouble[i].length; j++) {
                System.out.println("Input the element that has index " + i + j);
                arrDouble[i][j] = Double.parseDouble(scanner.nextLine());
            }
        }

        //Input index collumn to sum:
        System.out.println("Input a index of collumn you want to sum: ");
        int index = Integer.parseInt(scanner.nextLine());

        //Print a Result:
        System.out.println("Result: " + sumCol(arrDouble, index));
    }

    //Method use to sum values in one collumn:
    public static double sumCol(double[][] arr, int index) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[index][i];
        }
        return sum;
    }
}
