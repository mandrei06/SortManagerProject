package com.sparta.sortmanager.controller;

import com.sparta.sortmanager.logging.LogDriver;
import com.sparta.sortmanager.model.RandomIntArray;
import com.sparta.sortmanager.model.SortFactory;
import com.sparta.sortmanager.model.SortMethod;
import com.sparta.sortmanager.model.TimeCounter;
import com.sparta.sortmanager.view.ArrayLength;
import com.sparta.sortmanager.view.ArrayPrint;
import com.sparta.sortmanager.view.SortChoice;
import com.sparta.sortmanager.view.TimePrinter;

import java.util.Arrays;
import java.util.Scanner;

public class SortManager {
    public static void main(String[] args) {
        //Input for algorithm choice
        Scanner scanner = new Scanner(System.in);
        SortChoice.inputSortMethod();
        int algorithmChoice = scanner.nextInt();


        //Input for array length
        ArrayLength.inputArrayLength();
        int arrayLength = scanner.nextInt();


        //Creating a random integers array
        int[] numbersArray = RandomIntArray.randomIntArray(arrayLength);

        //Printing the unsorted array
        ArrayPrint.arrayPrint(numbersArray);

        //Start timing
        TimeCounter.startTime();

        SortMethod sortMethod = SortFactory.getSortMethod(algorithmChoice);
        try {
            System.out.println("You choose to use"+sortMethod.getClass().getSimpleName());//Add error handling for null
            System.out.println(Arrays.toString(sortMethod.sort(numbersArray)));


        } catch (NullPointerException e) {
            System.out.println("Invalid input!");
            LogDriver.logger.error("Invalid input");
        }

        //Display the time
        TimeCounter.stopTime();
        TimePrinter.totalTime();

    }

}
