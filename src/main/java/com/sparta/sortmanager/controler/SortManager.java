package com.sparta.sortmanager.controler;

import com.sparta.sortmanager.model.BubbleSort;
import com.sparta.sortmanager.model.MergeSort;
import com.sparta.sortmanager.model.SortFactory;
import com.sparta.sortmanager.model.SortMethod;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortManager {
    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();
        //Input for algorithm choice
        System.out.println("Please choose number:\n1-For bubble sort\n2-For merge sort");
        Scanner scanner=new Scanner(System.in);
        int algorithmChoice=scanner.nextInt();


        //Input for array length
        System.out.println("Please enter an integer number for the length of the array");
        int arrayLength=scanner.nextInt();
        int[] numbersArray = new int[arrayLength];

        //Creating a random integers array
        for (int i = 0; i < arrayLength; i++) {
            numbersArray[i] = new Random().nextInt(2000)-1000;//between -1000 and +1000
        }

        //Printing the unsorted array
        System.out.println(Arrays.toString(numbersArray));
        SortMethod sortMethod= SortFactory.getSortMethod(algorithmChoice);
        System.out.println("You choose to use:");
        System.out.println(sortMethod.getClass().getSimpleName());//Add error handling for null
        final long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime)+" milliseconds (1 ms = 0.001s)");

    }

}
