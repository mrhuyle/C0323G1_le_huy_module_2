package algorithm;

import java.util.HashSet;
import java.util.Set;

public class Exercise1 {
    public static void main(String[] args) {
        int[] array = {100};
        System.out.println(checkEqualFrequency(array));
    }

    public static boolean checkEqualFrequency(int[] array) {
        Set<Integer> integerSet = new HashSet<>();
        Set<Integer> checkSet = new HashSet<>();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            integerSet.add(array[i]);
        }
        for (Integer number : integerSet) {
            for (int i = 0; i < array.length; i++) {
                if (number == array[i]) {
                    count++;
                }
            }
            checkSet.add(count);
            count = 0;
        }
        if (array.length != 1 && checkSet.size() == 1) {
            return true;
        } else {
            return false;
        }
    }
}
