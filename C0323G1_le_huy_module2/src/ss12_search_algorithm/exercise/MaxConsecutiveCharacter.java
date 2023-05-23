package ss12_search_algorithm.exercise;

import java.util.LinkedList;

public class MaxConsecutiveCharacter {
    public static void main(String[] args) {
        String string = "abcabcd";
        LinkedList<Character> charConsecutiveList = new LinkedList<>();
        for (int i = 0; i < string.length() - 1; i++) {
            LinkedList<Character> tempList = new LinkedList<>();
            tempList.add(string.charAt(i));
            for (int j = i + 1; j < string.length() - 1; j++) {
                if (tempList.size()>0 && string.charAt(j) > tempList.getLast()) {
                    tempList.add(string.charAt(j));
                } else {
                    break;
                }
            }
            if (tempList.size() > charConsecutiveList.size()) {
                charConsecutiveList.clear();
                charConsecutiveList.addAll(tempList);
            }
        }
        System.out.println(string);
        for (Character character : charConsecutiveList) {
            System.out.print(character);
        }
    }
}
