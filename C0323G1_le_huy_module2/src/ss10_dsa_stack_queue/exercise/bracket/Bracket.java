package ss10_dsa_stack_queue.exercise.bracket;

import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {
        String str = "s * (s – a) * s – b) * (s – c)";
        System.out.println(checkBracket(str));
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
