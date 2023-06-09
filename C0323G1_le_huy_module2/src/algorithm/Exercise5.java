package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise5 {
    public static void main(String[] args) {
        String strInt = "-1,150,190,170,-1,-1,160,180";
        int[] arr = sortByHeight(strInt);
        for (Integer num: arr) {
            System.out.println(num);
        }
    }

    public static int[] sortByHeight(String strInt) {
        String[] arrStr = strInt.split(",");
        int[] result = new int[arrStr.length];
        List<Integer> integers = new ArrayList<>();
        for (String s : arrStr) {
            if (!s.equals("-1")) {
                integers.add(Integer.valueOf(s));
            }
        }
        Collections.sort(integers);
        for (int i = 0; i < arrStr.length; i++) {
            if (arrStr[i].equals("-1")) {
                result[i] = Integer.valueOf(arrStr[i]);
            } else {
                for (Integer num : integers) {
                    result[i] = num;
                    integers.remove(num);
                    break;
                }
            }
        }
        return result;
    }
}
