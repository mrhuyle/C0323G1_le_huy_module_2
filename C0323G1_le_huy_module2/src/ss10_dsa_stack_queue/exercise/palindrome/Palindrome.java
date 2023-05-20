package ss10_dsa_stack_queue.exercise.palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/** Author: Le Huy
 * Description: Check a input string, whether it is a palindrome or not.
 * Method: checkPalindrome(String str) has param: string, return datatype: boolean.
 */
public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string: ");
        String str = scanner.nextLine();
        if (checkPalindrome(str)) {
            System.out.println("The string: " + '"' + str + '"' + " is a palindrome" );
        } else {
            System.out.println("The string: " + '"' + str + '"' + " is NOT a palindrome" );
        }
    }

    public static boolean checkPalindrome(String str) {
        String lowerStr = str.toLowerCase();
        Stack<Character> stringStack = new Stack<>();
        Queue<Character> stringQueue = new LinkedList<>();
        for (int i = 0; i < lowerStr.length(); i++) {
            stringStack.push(lowerStr.charAt(i));
            stringQueue.add(lowerStr.charAt(i));
        }
        while (!stringQueue.isEmpty()) {
            if (stringStack.pop() != stringQueue.remove()) {
                return false;
            }
        }
        return true;
    }
}
