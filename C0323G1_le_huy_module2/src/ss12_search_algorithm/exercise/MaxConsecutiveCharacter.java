package ss12_search_algorithm.exercise;

import java.util.LinkedList;

public class MaxConsecutiveCharacter {
    public static void main(String[] args) {
        String string = "abcdefabcndefjkl";
        LinkedList<Character> charConsecutiveList = new LinkedList<>();
        for (int i = 0; i < string.length()-1; i++) {
            LinkedList<Character> tempList = new LinkedList<>();
            tempList.add(string.charAt(i));
            for (int j = i + 1; j < string.length()-1; j++) {
                if (string.charAt(j) > tempList.getLast() && !tempList.contains(string.charAt(j))) {
                    tempList.add(string.charAt(j));
                } else {
                    tempList.clear();
                }
            }
            if (tempList.size() > charConsecutiveList.size()) {
                charConsecutiveList.clear();
                charConsecutiveList.addAll(tempList);
            }
            tempList.clear();
        }
        System.out.println(string);
        for (Character character : charConsecutiveList) {
            System.out.print(character);
        }
    }
}
