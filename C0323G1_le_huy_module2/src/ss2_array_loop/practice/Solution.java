package ss2_array_loop.practice;

public class Solution {
    boolean solution(int[] a) {
        boolean result = false;
        for (int i = 0 ; i< a.length;i++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0 ; j < i ; j++) {
                sum1 += a[j];
            }
            for (int j = i + 1; j < a.length; j++) {
                sum2 += a[j];
            }
            if (sum1 == sum2) {
                result = true;
            } else {
                result = false;
            }
            sum1 = 0;
            sum2 = 0;
        }
        return result;
    }
}
