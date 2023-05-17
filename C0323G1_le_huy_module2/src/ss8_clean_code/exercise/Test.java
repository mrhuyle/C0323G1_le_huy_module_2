package ss8_clean_code.exercise;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input FirstPlayerScore");
        int firstPlayerScore = Integer.parseInt(scanner.nextLine());
        System.out.println("Input SecondPlayerScore");
        int secondPlayerScore = Integer.parseInt(scanner.nextLine());
        System.out.println(TennisGame.displayScore(firstPlayerScore,secondPlayerScore));
    }
}
