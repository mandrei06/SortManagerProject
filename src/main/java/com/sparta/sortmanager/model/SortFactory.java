package com.sparta.sortmanager.model;

public class SortFactory {

    public static SortMethod getSortMethod(int sortType) {
        if (sortType == 1) {
            return new BubbleSort();
        } else if (sortType == 2) {
            return new MergeSort();
        } else if(sortType==3){
            return new BinarySearchTree();
        }else
            return null;
    }
}
