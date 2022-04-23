package com.sparta.sortmanager.view;

import com.sparta.sortmanager.model.TimeCounter;

public class TimePrinter {
    public static void totalTime() {
        System.out.println("Total time for sorting: " + (TimeCounter.getEndTime()-TimeCounter.getStartTime()) + " milliseconds (1 ms = 0.001s)");

    }
}
