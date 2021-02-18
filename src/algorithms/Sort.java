package algorithms;

public abstract class Sort {

    public int[] intArray;

    public Sort(int[] intArray) {
        this.intArray = intArray;
    }

    public abstract void sort();

    public void printArray() {
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
    }
}
