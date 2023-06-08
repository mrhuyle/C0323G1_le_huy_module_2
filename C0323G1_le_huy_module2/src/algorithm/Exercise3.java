package algorithm;


public class Exercise3 {
    public static void main(String[] args) {
        String string = "1, 2, -1, 2";
        System.out.println(checkBeautifulArray(string));
    }
    public static boolean checkBeautifulArray(String string) {
        String [] arrStr = string.split(",");
        for (int i = 0; i < arrStr.length; i++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j < i; j++) {
                sum1 += Integer.valueOf(arrStr[j].trim());
            }
            for (int j = arrStr.length-1; j > i ; j--) {
                sum2 += Integer.valueOf(arrStr[j].trim());
            }
            if (sum1 == sum2) {
                return true;
            }
        }
        return false;
    }
}
