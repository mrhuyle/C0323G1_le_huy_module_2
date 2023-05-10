package ss3_array_method.exercise;

import java.util.Scanner;

public class FindMinElement {
    public static void main(String[] args) {
        int [] arrInt = new int[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arrInt.length; i++) {
            System.out.println("Input the element that has index " + i);
            arrInt[i] = Integer.parseInt(scanner.nextLine());
        }
        int min = arrInt[0];
        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i] < min) {
                min = arrInt[i];
            }
        }
        System.out.println("The min element is: " + min);
    }
}
