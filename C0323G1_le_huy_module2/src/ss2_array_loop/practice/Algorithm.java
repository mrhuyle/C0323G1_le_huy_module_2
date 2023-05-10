package ss2_array_loop.practice;

public class Algorithm {
    public static void main(String[] args) {
        int h = 11;
        for (int i = -4; i < 5; i++) {
            for (int j = -5; j < h; j++) {
                System.out.print(" ");
                if (Math.abs(j) == 11 / 2 - Math.abs(i)) {
                    System.out.print(11 / 2 - Math.abs(i));
                }
            }
            System.out.println(" ");
        }
    }
}
