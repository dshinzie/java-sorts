import java.util.Arrays;

public class Sorts {
    public static void main(String args[]) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Array pre-sorted:");
        System.out.println(Arrays.toString(arr));

        // Bubble sort
        System.out.println("Bubble sort:");
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.performSort(arr);

        // Insertion sort
        System.out.println("Insertion sort:");
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.performSort(arr);
    }
}
