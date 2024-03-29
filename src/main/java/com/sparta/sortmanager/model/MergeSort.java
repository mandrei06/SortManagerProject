package com.sparta.sortmanager.model;

import com.sparta.sortmanager.logging.LogDriver;
import com.sparta.sortmanager.model.Sortable;

public class MergeSort extends SortMethod {

    void mergeSort(int[] arr, int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int[] L = new int[n1];
        int[] R = new int[n2];

        /*Copy data to temp arrays*/
        System.arraycopy(arr, l, L, 0, n1);
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }

    }

    public int[] sortAr(int[] arr, int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort first and second halves
            sortAr(arr, l, m);
            sortAr(arr, m + 1, r);

            // Merge the sorted halves
            mergeSort(arr, l, m, r);
        }
        return arr;
    }

    //This is my adaptor method
    @Override
    public int[] sort(int[] array) {
        int[] copyArray = array;
        copyArray = sortAr(copyArray, 0, array.length - 1);
        LogDriver.logger.info("MergeSort ran successfully!");
        return copyArray;
    }
}
