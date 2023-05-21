package ss10_dsa_stack_queue.exercise.bracket;

import java.util.Stack;

/**
 * Author: Le Huy
 * Description: Using Stack to check the function with brackets
 * Method: checkBracket(String str) has param String (function) and return datatype boolean
 * Notice: check the case that the function doesn't contain any "(" or ")" symbol.
 */
public class Bracket {
    public static void main(String[] args) {
        String str = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))";
        if (!str.contains("(") && !str.contains(")")) {
            System.out.println("The function: " + str + " does not contain any brackets");
        } else if (checkBracket(str)) {
            System.out.println("The function: " + str + " contains brackets and they are TRUE");
        } else {
            System.out.println("The function: " + str + " contains brackets and they are FALSE");
        }
    }

    public static boolean checkBracket(String str) {
        Stack<Character> bracketStack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                bracketStack.push(str.charAt(i));
            } else if (str.charAt(i) == ')' && bracketStack.isEmpty()) {
                return false;
            } else if (str.charAt(i) == ')') {
                bracketStack.pop();
            }
        }
        if (bracketStack.isEmpty()) {
            return true;
        } else return false;
    }
}
