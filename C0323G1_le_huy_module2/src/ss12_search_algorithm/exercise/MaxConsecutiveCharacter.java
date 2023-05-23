package ss12_search_algorithm.exercise;

import java.util.LinkedList;
import java.util.Scanner;
/**
 * Author: Le Huy
 * Description: Using linear search algorithm, LinkedList to find max length string (consecutive character in ascending order).
 * Method: getMaxConsecutiveChar(String string)
 */
public class MaxConsecutiveCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input String: ");
        String string = scanner.nextLine();
        getMaxConsecutiveChar(string);
    }

    public static void getMaxConsecutiveChar(String string) {
        LinkedList<Character> charConsecutiveList = new LinkedList<>();
        LinkedList<Character> tempList = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            tempList.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > tempList.getLast()) {
                    tempList.add(string.charAt(j));
                } else {
                    break;
                }
            }
            if (tempList.size() > charConsecutiveList.size()) {
                charConsecutiveList.clear();
                charConsecutiveList.addAll(tempList);
            }
            tempList.clear();
        }
        System.out.println("Input String: " + string);
        System.out.print("Max string (consecutive character in ascending order): ");
        for (Character character : charConsecutiveList) {
            System.out.print(character);
        }
    }
}

