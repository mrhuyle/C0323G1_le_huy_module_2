package ss12_search_algorithm.exercise;

import ss11_map.exercise.product_management.model.Product;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/**
 * Author: Le Huy
 * Description: Using binary search algorithm and recursion to find a value in number array (input from user)
 * Method: binarySearch(int[] array, int left, int right, int value)
 * Notice: using recursion
 */
public class FindNumberInArray {
    public static void main(String[] args) {
        //Create a array by user:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input length of array");
        int length = Integer.parseInt(scanner.nextLine());
        int[] arrNum = new int[length];
        for (int i = 0; i < arrNum.length; i++) {
            System.out.println("Input the element that have index" + i + " in the array");
            arrNum[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("The array has been created is: ");
        System.out.println(Arrays.toString(arrNum));

        //Sort the array in ascending order:
        System.out.println("After sort in ascending order, the array is: ");
        Arrays.sort(arrNum);
        System.out.println(Arrays.toString(arrNum));

        //Input the value and search for it in the array:
        System.out.println("Input the value that you want to find: ");
        int number = Integer.parseInt(scanner.nextLine());

        //Dislplay the result:
        int result = binarySearch(arrNum, 0, arrNum.length - 1, number);
        System.out.println(result);
        if (result != -1) {
            System.out.println("The number " + number + " has the index " + result + " in the array");
        } else {
            System.out.println("Do not find the number " + number);
        }

    }

    public static int binarySearch(int[] array, int left, int right, int value) {
        int middle = (left + right) / 2;
        if (array[middle] == value) {
            return middle;
        }
        if (value > middle) {
            left = middle + 1;
        } else {
            right = middle - 1;
        }
        if (left > right) {
            return -1;
        }
        return binarySearch(array, left, right, value);
    }
}
