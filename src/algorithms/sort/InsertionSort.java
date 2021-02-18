package algorithms.sort;

import algorithms.Sort;

public class InsertionSort extends Sort {

    public InsertionSort(int[] intArray) {
        super(intArray);
    }

    @Override
    public void sort() {
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++){
            int newElement = intArray[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--)
                intArray[i] = intArray[i - 1];
            intArray[i] = newElement;
        }
    }
}
