package Ss4_class_and_object_in_java;

import java.time.LocalTime;

public class StopWatch {
    private long endTime, startTime;

    public StopWatch(long endTime, long startTime) {
        this.endTime = endTime;
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public long getStartTime() {
        return startTime;
    }


    public long start() {
        return this.startTime = System.currentTimeMillis();
    }

    public long stop() {
        return this.endTime = System.currentTimeMillis();
    }

    public void getElapsedTime() {
        System.out.println(stop()- start());
    }


    public static void main(String[] args) {
        long a = 0, b=0;
        StopWatch stopWatch = new StopWatch(a, b);
        a = stopWatch.start();
        b = stopWatch.stop();
        for (long i = 0; i < 1000000000; i++) {
            for (long j = 0; j < 300000000; j++) {

            }
        }
        stopWatch.getElapsedTime();
    }
}
