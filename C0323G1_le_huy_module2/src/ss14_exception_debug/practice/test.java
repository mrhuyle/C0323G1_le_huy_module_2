package ss14_exception_debug.practice;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        String str = "CodegymDaNang";
        System.out.println(solution(str));
    }
    public static String solution(String s) {
        List<Character> strList = new ArrayList<>();
        for (int index = 0; index < s.length(); index++) {
            if (index>0 && Character.isUpperCase(s.charAt(index))&&Character.isLowerCase(s.charAt(index-1))) {
                strList.add(' ');
            }
            strList.add(s.charAt(index));
        }
        String newStr = "";
        for (Character character : strList) {
            newStr += character;
        }
        newStr = newStr.toLowerCase();
        return newStr;
    }

}
