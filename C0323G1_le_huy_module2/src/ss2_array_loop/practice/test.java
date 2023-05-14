package ss2_array_loop.practice;


public class test {
    public static void main(String[] args) {
        int[] arr = new int [] {1,3,8,7};
        for (int value: sortDESC(arr)) {
            System.out.println(value);
        }
    }

    public static int[] sortDESC(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
