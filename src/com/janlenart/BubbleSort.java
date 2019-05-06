package com.janlenart;

public class BubbleSort {

    public static void main(String[] args) {
        int[] intArray = {3, -10, 15, -38, 121, -18, 45, 23, 0};
        int unsortedPartitionIndex = intArray.length;



    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
