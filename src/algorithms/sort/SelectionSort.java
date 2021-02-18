package algorithms.sort;

import algorithms.Sort;

public class SelectionSort extends Sort {

    public SelectionSort(int[] intArray) {
        super(intArray);
    }

    @Override
    public void sort() {
        for (int lastPosition = intArray.length - 1; lastPosition > 0; lastPosition--){
            int largest = 0;
            for (int i = 1; i <= lastPosition; i++) {
                if (intArray[i] > intArray[largest])
                    largest = i;
            }
            swap(intArray, largest, lastPosition);
        }
    }

    private static void swap(int[] array, int i, int j){
        int aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }
}
