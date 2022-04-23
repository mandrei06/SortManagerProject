package com.sparta.sortmanagertest;

import com.sparta.sortmanager.model.BinarySearchTree;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BinaryTreeSearchTest {
    BinarySearchTree binaryTree;
    @BeforeEach
    void setUp() {
        binaryTree =new BinarySearchTree();
    }

    @AfterEach
    void tearDown() {
        binaryTree =null;
    }

    @Test
    void normalInput() {
       int[] result= binaryTree.sort(new int[]{-569, 268, -139, -298, -249, 507, 169, -52, 916, -115});
       int[] expected=new int[]{-569, -298, -249, -139, -115, -52, 169, 268, 507, 916};
        Assertions.assertArrayEquals(result,expected);
    }
    @Test
    void nullInput() {
        int[] result= binaryTree.sort(new int[]{});
        int[] expected=new int[]{};
        Assertions.assertArrayEquals(result,expected);
    }
}
