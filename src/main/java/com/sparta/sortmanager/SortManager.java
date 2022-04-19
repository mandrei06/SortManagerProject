package com.sparta.sortmanager;

import java.util.Scanner;

public class SortManager {
    public static void main(String[] args) {

        System.out.println("Please choose number:\n1-For bubble sort\n2-For merge sort");
        Scanner scanner=new Scanner(System.in);
        int algorithmChoice=scanner.nextInt();
        System.out.println(algorithmChoice);
    }

}
