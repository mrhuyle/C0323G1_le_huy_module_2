package ss3_array_method.exercise;

import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        int[] arrayInt = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a Index: ");
        int index = Integer.parseInt(scanner.nextLine());
        System.out.println("Input a Element: ");
        int element = Integer.parseInt(scanner.nextLine());
        if (index < 0 || index > arrayInt.length - 1) {
            System.out.println("Invalid Index");
        } else {
            for (int i = arrayInt.length - 1; i >= index; i--) {
                arrayInt[i] = arrayInt[i - 1];
            }
            arrayInt[index] = element;
            for (int i = 0; i < arrayInt.length; i++) {
                System.out.print(arrayInt[i] + "; ");
            }
        }

    }
}
