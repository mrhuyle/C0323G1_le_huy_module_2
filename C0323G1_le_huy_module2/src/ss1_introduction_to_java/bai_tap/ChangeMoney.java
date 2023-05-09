package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        int rate = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input amount of USD: ");
        double usd = scanner.nextDouble();
        double vnd = usd * rate;
        if (usd < 0) {
            System.out.println("Invalid USD!");
        } else {
            System.out.println("Amount of VND: " + vnd);
        }
    }
}
