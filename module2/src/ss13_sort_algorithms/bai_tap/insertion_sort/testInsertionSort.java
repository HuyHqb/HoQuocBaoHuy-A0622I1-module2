package ss13_sort_algorithms.bai_tap.insertion_sort;

import static ss13_sort_algorithms.bai_tap.insertion_sort.InsertionSort.insertionSort;

public class testInsertionSort {
    public static void main(String[] args) {
        int[] list = {100, 32, 12, 104, 85, 60};

        insertionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
