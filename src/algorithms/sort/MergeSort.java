package algorithms.sort;

import algorithms.Sort;

public class MergeSort extends Sort {

    public MergeSort(int[] intArray) {
        super(intArray);
    }

    @Override
    public void sort() {
        mergeSort(intArray, 0, intArray.length);
    }

    private void mergeSort(int[] intArray, int startIndex, int endIndex) {
        if (endIndex - startIndex < 2)
            return;

        int mid = (startIndex + endIndex) / 2;
        mergeSort(intArray, startIndex, mid);
        mergeSort(intArray, mid, endIndex);
        merge(intArray, startIndex, mid, endIndex);
    }

    private void merge(int[] input, int start, int mid, int end) {
        if (input[mid - 1] <= input[mid])
            return;

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }


}
