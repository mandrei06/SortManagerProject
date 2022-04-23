package com.sparta.sortmanagertest;

import com.sparta.sortmanager.model.BinarySearchTree;
import com.sparta.sortmanager.model.BubbleSort;
import com.sparta.sortmanager.model.MergeSort;
import com.sparta.sortmanager.model.SortFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortFactoryTest {

    @Test
    void bubbleInput() {
        Object result =SortFactory.getSortMethod(1);
        Object expected =new BubbleSort();
        if (result != null) {
            Assertions.assertEquals(result.getClass(),expected.getClass());
        }
    }
    @Test
    void mergeInput() {
        Object result =SortFactory.getSortMethod(2);
        Object expected =new MergeSort();
        if (result != null) {
            Assertions.assertEquals(result.getClass(),expected.getClass());
        }
    }
    @Test
    void binaryTreeInput() {
        Object result =SortFactory.getSortMethod(3);
        Object expected =new BinarySearchTree();
        if (result != null) {
            Assertions.assertEquals(result.getClass(),expected.getClass());
        }
    }

}
