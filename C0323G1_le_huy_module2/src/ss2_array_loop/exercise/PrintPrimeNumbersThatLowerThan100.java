package ss2_array_loop.exercise;

public class PrintPrimeNumbersThatLowerThan100 {
    public static void main(String[] args) {
        int countCheck = 0;
        for (int primeNumber = 2; primeNumber <= 100; primeNumber++) {
            for (int i = 2; i <= primeNumber; i++) {
                if (primeNumber % i == 0) {
                    countCheck++;
                }
            }
            if (countCheck == 1) {
                System.out.print(primeNumber + ", ");
                countCheck = 0;
            } else {
                countCheck = 0;
            }
        }
    }
}
