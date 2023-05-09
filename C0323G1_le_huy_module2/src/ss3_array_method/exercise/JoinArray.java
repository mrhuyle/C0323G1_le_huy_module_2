package ss3_array_method.exercise;

import java.util.Scanner;

public class JoinArray {
    public static void main(String[] args) {
        int[] arrFirstInt = new int[2];
        int[] arrSecondInt = new int[4];
        Scanner scanner = new Scanner(System.in);
        //Input elements of the Firts Array:
        for (int i = 0; i < arrFirstInt.length; i++) {
            System.out.println("First array: Input the element that has index " + i);
            arrFirstInt[i] = Integer.parseInt(scanner.nextLine());
        }
        //Input elements of the Second Array:
        for (int i = 0; i < arrSecondInt.length; i++) {
            System.out.println("Second array: Input the element that has index " + i);
            arrSecondInt[i] = Integer.parseInt(scanner.nextLine());
        }
        //Join two arrays:
        int[] arrThirdInt = new int[arrFirstInt.length + arrSecondInt.length];
        for (int i = 0; i < arrFirstInt.length; i++) {
            arrThirdInt[i] = arrFirstInt[i];
        }
        for (int i = arrFirstInt.length; i < arrThirdInt.length; i++) {
            arrThirdInt[i] = arrSecondInt[i - arrFirstInt.length];
        }
        //Print Third Array (Join Array):
        System.out.print("Third Array (Join Array): ");
        for (int i = 0; i < arrThirdInt.length; i++) {
            System.out.print(arrThirdInt[i] + "; ");
        }
    }
}
