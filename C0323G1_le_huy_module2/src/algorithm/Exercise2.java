package algorithm;

import java.util.HashSet;
import java.util.Set;

public class Exercise2 {
    public static void main(String[] args) {
        String s1 = "Abc";
        String s2 = "ade";
        System.out.println(commonCharacter(s1,s2));
    }
    public static int commonCharacter(String s1, String s2) {
        Set<Character> characterSet = new HashSet<>();
        int result = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < s1.length(); i++) {
            Character ch = s1.charAt(i);
            if (s2.contains(String.valueOf(ch))) {
                characterSet.add(ch);
            }
        }
        for (Character ch: characterSet) {
            for (int i = 0; i < s1.length(); i++) {
                if (ch == s1.charAt(i)) {
                    count1++;
                }
            }
            for (int i = 0; i < s2.length(); i++) {
                if (ch == s2.charAt(i)) {
                    count2++;
                }
            }
            if (count1 >= count2) {
                result += count2;
            } else {
                result += count1;
            }
            count2 = 0;
            count1 = 0;
        }
        return result;
    }
}
