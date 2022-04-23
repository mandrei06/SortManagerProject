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
import java.util.InputMismatchException;
import java.util.Scanner;

public class SortManager {
    public static void main(String[] args) {
        //Start timing
        TimeCounter.startTime();


        //Input for algorithm choice
        Scanner scanner;
        SortChoice.inputSortMethod();
        int algorithmChoice;
        while (true) {
            try {
                scanner = new Scanner(System.in);
                algorithmChoice = scanner.nextInt();
                if (SortFactory.getSortMethod(algorithmChoice) == null) {
                    throw new InputMismatchException();
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input!");
                LogDriver.logger.error("Invalid input" + e);
            }
        }


        //Input for array length
        ArrayLength.inputArrayLength();
        int arrayLength;
        while (true) {
            try {
                scanner = new Scanner(System.in);
                arrayLength = scanner.nextInt();
                if (arrayLength < 0) {
                    throw new InputMismatchException();
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input!");
                LogDriver.logger.error("Invalid input" + e);
            }
        }


        //Creating a random integers array
        int[] numbersArray = RandomIntArray.randomIntArray(arrayLength);

        //Printing the unsorted array
        System.out.println("Array before sorting:");
        ArrayPrint.arrayPrint(numbersArray);


        SortMethod sortMethod = SortFactory.getSortMethod(algorithmChoice);
        try {
            if (sortMethod != null) {
                System.out.println("You choose to use " + sortMethod.getClass().getSimpleName());//Add error handling for null
                System.out.println("Array after sorting");
                System.out.println(Arrays.toString(sortMethod.sort(numbersArray)));
            }


        } catch (NullPointerException e) {
            System.out.println("Invalid input!");
            LogDriver.logger.error("Invalid input" + e);
        }

        //Display the time
        TimeCounter.stopTime();
        TimePrinter.totalTime();


    }

}
