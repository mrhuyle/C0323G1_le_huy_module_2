package ss10_dsa_stack_queue.exercise.reverse_element;

import java.util.Arrays;
import java.util.Stack;

/**
 * Author: Le Huy C0323G1
 * Decription: Practice using Stack to reverse: (1) intergers in array and (2) words in string
 * Method using: 2 methods
 * @ reverseInteger(Integer[] arr)
 * @ reverseWordsInString(String str)
 */
public class ReverseUsingStack {
    public static void main(String[] args) {
        System.out.println("Reverse intergers in array");
        Integer[] arrNum = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arrNum));
        reverseIntegers(arrNum);
        System.out.println("Reverse words in string");
        String str = "Truong Tan Hai";
        reverseWordsInString(str);
        System.out.println(str);
    }

    public static void reverseIntegers(Integer[] arr) {
        Stack<Integer> stackNumbers = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stackNumbers.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stackNumbers.pop();
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void reverseWordsInString(String str) {
        Stack<String> stackCharacter = new Stack<>();
        String[] arrStr = str.split(" ");
        for (int i = 0; i < arrStr.length; i++) {
            stackCharacter.push(arrStr[i]);
        }
        for (int i = 0; i < arrStr.length; i++) {
            arrStr[i] = stackCharacter.pop();
        }
        str = "";
        for (int i = 0; i < arrStr.length; i++) {
            if (i == arrStr.length - 1) {
                str += arrStr[i];
                break;
            }
            str += arrStr[i] + " ";
        }
        System.out.println(str);
    }
}
