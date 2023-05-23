package ss12_search_algorithm.exercise;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Author: Le Huy
 * Description: Using linear search algorithm, LinkedList to find max length string (character in ascending order)
 * Method: findMaxCharString(String string)
 */
public class SortWordLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input String: ");
        String string = scanner.nextLine();
        findMaxCharString(string);
    }

    public static void findMaxCharString(String string) {
        LinkedList<Character> maxList = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> tempList = new LinkedList<>();
            tempList.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > tempList.getLast()) {
                    tempList.add(string.charAt(j));
                }
                if (tempList.size() > maxList.size()) {
                    maxList.clear();
                    maxList.addAll(tempList);
                }
            }
            tempList.clear();
        }
        System.out.println("String: " + string);
        System.out.print("Max string (character in ascending order) : ");
        for (Character character : maxList) {
            System.out.print(character);
        }
    }
}
