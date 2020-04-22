package bubblesort;

public class BubbleSortMain {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = {11, 45,62,10,6,1,0,13};
        System.out.println("Array to be Sorted ");
        bubbleSort.printArray(array);
        bubbleSort.bubbleSort(array);
        System.out.println("SORTED ARRAY: ");
        bubbleSort.printArray(array);
    }
}
