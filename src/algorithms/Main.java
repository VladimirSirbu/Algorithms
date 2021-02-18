package algorithms;

import algorithms.sort.InsertionSort;

public class Main {
    public static void main(String[] args) {
        int[] intArray = new int[]{20, 35, -15, 7, 55, 1, -22};

        Sort sort = new InsertionSort(intArray);
        sort.sort();
        sort.printArray();
    }
}
