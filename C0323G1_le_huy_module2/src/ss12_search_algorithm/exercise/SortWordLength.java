package ss12_search_algorithm.exercise;

import java.util.LinkedList;

public class SortWordLength {
    public static void main(String[] args) {
        String str = "Welcome";
        LinkedList<Character> maxList = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            LinkedList<Character> tempList = new LinkedList<>();
            tempList.add(str.charAt(i));
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) > tempList.getLast()) {
                    tempList.add(str.charAt(j));
                }
                if (tempList.size() > maxList.size()) {
                    maxList.clear();
                    maxList.addAll(tempList);
                }
            }
            tempList.clear();
        }
        System.out.println("String: " + str);
        System.out.print("Max string (character in ascending order) : ");
        for (Character character: maxList) {
            System.out.print(character);
        }
    }
}
