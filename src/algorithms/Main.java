package algorithms;

import algorithms.sort.BubbleSort;

public class Main {
    public static void main(String[] args) {
        int[] intArray = new int[]{20, 35, -15, 7, 55, 1, -22};

        Sort bubbleSort = new BubbleSort(intArray);
        bubbleSort.sort();
        printArray(intArray);
    }

    private static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
