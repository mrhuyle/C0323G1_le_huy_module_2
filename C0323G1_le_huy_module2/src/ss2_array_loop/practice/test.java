package ss2_array_loop.practice;


public class test {
    public static void main(String[] args) {
        int n = 123;
        String str = Integer.toString(n);
        System.out.println(str);
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += Character.getNumericValue(str.charAt(i));
        }
        System.out.println(sum);
    }
}
