package ss18_solid.practice;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int [] a = {-1, 150, 190, 170, -1, -1, 160, 180};
        List<Integer> arrTree = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == -1) {
                arrTree.add(i);
            } else {
                arr.add(a[i]);
            }
        }
        Collections.sort(arr);
        for (int i = 0; i < arrTree.size(); i++) {
            arr.add(arrTree.get(i),-1);
        }
        int [] result = new int[arr.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = arr.get(i);
        }
    }
}
