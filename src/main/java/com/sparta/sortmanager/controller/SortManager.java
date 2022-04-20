package com.sparta.sortmanager.controller;

import com.sparta.sortmanager.model.SortFactory;
import com.sparta.sortmanager.model.SortMethod;
import com.sparta.sortmanager.view.DisplayManager;

import java.util.Arrays;
import java.util.Random;

public class SortManager {
    public static void main(String[] args) {

        //Input for algorithm choice
        DisplayManager displayManager=new DisplayManager();
        int algorithmChoice = displayManager.inputSortMethod();

        //Input for array length
        int arrayLength=displayManager.inputArrayLength();

        //Move this to MODEL
        //Move this to MODEL
        //Move this to MODEL
        //Move this to MODEL
        //Move this to MODEL
        //Creating a random integers array
        int[] numbersArray = new int[arrayLength];//move this to MODEL
        for (int i = 0; i < arrayLength; i++) {
            numbersArray[i] = new Random().nextInt(2000)-1000;//between -1000 and +1000
        }

        //Printing the unsorted array
        System.out.println(Arrays.toString(numbersArray));
        final long startTime = System.currentTimeMillis();
        SortMethod sortMethod= SortFactory.getSortMethod(algorithmChoice);
        System.out.println("You choose to use:");
        System.out.println(sortMethod.getClass().getSimpleName());//Add error handling for null
        final long endTime = System.currentTimeMillis();
        System.out.println("Total time for sorting: " + (endTime - startTime)+" milliseconds (1 ms = 0.001s)");

    }

}
