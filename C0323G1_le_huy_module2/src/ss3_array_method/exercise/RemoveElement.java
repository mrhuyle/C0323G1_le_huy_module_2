package ss3_array_method.exercise;

import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arrayInt = {10, 4, 6, 6, 6, 8, 6, 0, 0, 0, 0};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a Number: ");
        int inputNumber = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        int countFinal = 0;
        do {
            for (int i = 0; i < arrayInt.length; i++) {
                if (inputNumber == arrayInt[i]) {
                    for (int j = i; j < arrayInt.length - 1; j++) {
                        arrayInt[j] = arrayInt[j + 1];
                        check = true;
                    }
                }
            }
            countFinal = 0;
            for (int i = 0; i < arrayInt.length; i++) {
                if (inputNumber == arrayInt[i]) {
                    countFinal++;
                }
            }
        } while (countFinal > 0);
        if (check) {
            for (int number : arrayInt) {
                System.out.print(number + "; ");
            }
        } else {
            System.out.println("There is no similar element in the array!");
        }
    }
}
