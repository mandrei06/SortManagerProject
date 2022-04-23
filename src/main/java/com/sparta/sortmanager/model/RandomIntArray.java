package com.sparta.sortmanager.model;

import java.util.Random;

public class RandomIntArray {

    public static int[] randomIntArray(int arrayLength){
        int[] numbersArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            numbersArray[i] = new Random().nextInt(2000)-1000;//between -1000 and +1000
        }
        return numbersArray;
    }
}
