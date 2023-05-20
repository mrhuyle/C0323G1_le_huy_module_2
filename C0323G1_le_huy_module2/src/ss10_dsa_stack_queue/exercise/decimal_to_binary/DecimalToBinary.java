package ss10_dsa_stack_queue.exercise.decimal_to_binary;

import java.util.Scanner;
import java.util.Stack;

/**
 * Author: Le Huy
 * Decription: decimal to binary using Stack
 * Method: convertDecimalToBinary(int number) has param: number, return datatype: String.
 */
public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println("Input decimal");
        Scanner scanner = new Scanner(System.in);
        Integer number = Integer.parseInt(scanner.nextLine());
        System.out.println("Output binary: ");
        System.out.println(convertDecimalToBinary(number));
    }

    public static String convertDecimalToBinary(int number) {
        Stack<Integer> integerStack = new Stack<>();
        String result = "";
        for (int i = number; i > 0; i = i / 2) {
            integerStack.push(i % 2);
        }

        while (integerStack.size() != 0) {
            result += integerStack.pop().toString();
        }
        return result;
    }
}
