package ss4_class.exercise.stop_watch;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public long start() {
        return this.startTime = System.currentTimeMillis();
    }

    public long stop() {
        return this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return getEndTime() - getStartTime();
    }
}
