package ss3_array_method.exercise;

import java.util.Scanner;

public class CountCharInString {
    public static void main(String[] args) {
        String str = new String("abcabcabcdef");
        System.out.println("The default string is: " + str);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a character you want to count: ");
        char charInput = scanner.nextLine().charAt(0); //Input char

        //Result:
        if (countChar(str,charInput) > 0) {
            System.out.println("The numbers of char " + charInput + " in string " + str + " is: " + countChar(str,charInput));
        } else {
            System.out.println("Do not find the input character");
        }
    }

    //Method numbers of input char in string:
    public static int countChar(String str, char char1) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (char1 == str.charAt(i)) {
                result++;
            }
        }
        return result;
    }
}
