package com.sparta.sortmanager.model;

public class TimeCounter {
    public static long startTime;
    public static long endTime;

    public static long getStartTime() {
        return startTime;
    }

    public static long getEndTime() {
        return endTime;
    }

    public static void startTime() {
        startTime = System.currentTimeMillis();
    }

    public static void stopTime() {
        endTime = System.currentTimeMillis();
    }


}
