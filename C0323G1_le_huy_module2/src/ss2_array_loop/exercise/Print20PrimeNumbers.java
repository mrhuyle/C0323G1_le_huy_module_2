package ss2_array_loop.exercise;

import java.util.Scanner;

public class Print20PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input numbers of prime numbers: ");
        int numbers = Integer.parseInt(scanner.nextLine());
        System.out.println(numbers);
        int countPrimeNumber = 0;
        int countCheck = 0;
        for (int primeNumber = 2; countPrimeNumber < numbers; primeNumber++) {
            for (int i = 2; i <= primeNumber; i++) {
                if (primeNumber % i == 0) {
                    countCheck++;
                }
            }
            if (countCheck == 1) {
                countPrimeNumber++;
                System.out.print(primeNumber + ", ");
            }
            countCheck = 0;
        }
    }
}