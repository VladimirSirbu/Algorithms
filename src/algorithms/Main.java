package algorithms;

import algorithms.sort.SelectionSort;

public class Main {
    public static void main(String[] args) {
        int[] intArray = new int[]{20, 35, -15, 7, 55, 1, -22};

        Sort sort = new SelectionSort(intArray);
        sort.sort();
        sort.printArray();
    }
}
