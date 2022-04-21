package com.sparta.sortmanagertest;

import com.sparta.sortmanager.model.BubbleSort;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {
    BubbleSort bubbleSort;
    @BeforeEach
    void setUp() {
        bubbleSort=new BubbleSort();
    }

    @AfterEach
    void tearDown() {
        bubbleSort=null;
    }

    @Test
    void sort() {
       int[] result= bubbleSort.sort(new int[]{-569, 268, -139, -298, -249, 507, 169, -52, 916, -115});
       int[] expected=new int[]{-569, -298, -249, -139, -115, -52, 169, 268, 507, 916};
        Assertions.assertArrayEquals(result,expected);
    }
}
