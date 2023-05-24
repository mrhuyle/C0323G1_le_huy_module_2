package ss13_sorting_algorithm.exercise.insertion_sort_method;

import java.util.Arrays;

/**
 * Author: Le Huy
 * Description: Build and use the insert algorithm method to sort integers in an array.
 * Method: sortInsertionAlgorithm(int[] list): param int[], return data value int[].
 */
public class InsertionSortMethod {
    public static void main(String[] args) {
        int[] list = {4, 2, 3, 5, 6, 7, 9, 20};
        System.out.println("List");
        System.out.println(Arrays.toString(list));
        System.out.println("Sorted List");
        sortInsertionAlgorithm(list);
        System.out.println(Arrays.toString(list));
    }

    public static int[] sortInsertionAlgorithm(int[] list) {
        int x;
        int pos;
        for (int i = 1; i < list.length; i++) {
            x = list[i];
            pos = i;
            while (pos > 0 && x < list[pos - 1]) {
                list[pos] = list[pos-1];
                pos--;
            }
            list[pos] = x;
        }
        return list;
    }
}
