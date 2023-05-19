package ss10_dsa_stack_queue.exercise.reverse_element;

import java.util.Arrays;
import java.util.Stack;

public class ReverseArray {
    public static void main(String[] args) {
        System.out.println("Reverse Interger Array");
        int[] arrNum = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arrNum));
        Stack<Integer> stackNumbers = new Stack<>();
        for (int i = 0; i < arrNum.length; i++) {
            stackNumbers.push(arrNum[i]);
        }
        for (int i = 0; i < arrNum.length; i++) {
            arrNum[i] = stackNumbers.pop();
        }
        System.out.println(Arrays.toString(arrNum));

        System.out.println("Reverse String");
        String str = "abcde";
        Stack<Character> stackCharacter = new Stack<>();
        System.out.println(str);
        Character[] arrChar = new Character[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arrChar[i] = str.charAt(i);
        }
        for (int i = 0; i < arrChar.length; i++) {
            stackCharacter.push(arrChar[i]);
        }
        for (int i = 0; i < arrChar.length; i++) {
            arrChar[i] = stackCharacter.pop();
        }
        for (Character character : arrChar) {
            System.out.print(character);
        }
    }
}
