package ss3_array_method.exercise;

import java.util.Scanner;

public class SumOfDiagonalSquare {
    public static void main(String[] args) {
        //Make a square array
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input side index of square array: ");
        int side = Integer.parseInt(scanner.nextLine());
        double[][] arrDouble = new double[side][side];
        for (int i = 0; i < arrDouble.length; i++) {
            for (int j = 0; j < arrDouble[i].length; j++) {
                System.out.println("Input the element that has index " + i + j);
                arrDouble[i][j] = Double.parseDouble(scanner.nextLine());
            }
        }
        //Print a result:
        System.out.println("Result: " + sumDiagonal(arrDouble));
    }

    //Method to sum values in the diagonal of square array:
    public static double sumDiagonal(double[][] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        return sum;
    }
}
