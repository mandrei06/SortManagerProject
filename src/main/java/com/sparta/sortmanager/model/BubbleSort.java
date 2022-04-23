package com.sparta.sortmanager.model;

import com.sparta.sortmanager.logging.LogDriver;
import com.sparta.sortmanager.model.Sortable;

public class BubbleSort extends SortMethod {
    public int[] sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
        LogDriver.logger.info("BubbleSort ran successfully!");
        return array;
    }
}
