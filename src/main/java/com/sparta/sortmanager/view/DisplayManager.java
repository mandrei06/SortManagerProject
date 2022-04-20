package com.sparta.sortmanager.view;

import java.util.Scanner;

public class DisplayManager {
    Scanner scanner=new Scanner(System.in);

    public int inputSortMethod(){
        System.out.println("Please choose number:\n1-For bubble sort\n2-For merge sort");
        return scanner.nextInt();
    }
    public int inputArrayLength(){
        System.out.println("Please enter an integer number for the length of the array");
        return scanner.nextInt();
    }
}
