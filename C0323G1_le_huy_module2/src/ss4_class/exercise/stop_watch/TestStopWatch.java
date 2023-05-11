package ss4_class.exercise.stop_watch;

import java.util.Scanner;

public class TestStopWatch {
    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        Scanner scanner = new Scanner(System.in);
        System.out.println("You had created the Stop Watch");
        System.out.println("Press any key to start");
        String press = scanner.nextLine();
        watch.start();
        System.out.println("This time when you press start: " + watch.getStartTime());
        System.out.println("Press any key to stop");
        press = scanner.nextLine();
        watch.stop();
        System.out.println("This time when you press stop: " + watch.getEndTime());
        System.out.println("The amout of time is: " + watch.getElapsedTime());
    }
}
