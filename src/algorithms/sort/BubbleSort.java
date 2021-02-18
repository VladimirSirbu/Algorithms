package algorithms.sort;

import algorithms.Sort;

public class BubbleSort extends Sort {

    public BubbleSort(int[] array) {
        super(array);
    }

    @Override
    public void sort() {
        for (int lastIndex = intArray.length - 1; lastIndex > 0; lastIndex--)
            for (int i = 0; i < lastIndex; i++)
                if (intArray[i] > intArray[i+1])
                    swap(intArray, i, i+1);
    }

    private void swap(int[] a, int i, int j){
        int aux = a[i];
        a[i] = a[j];
        a[j] = aux;
    }
}
