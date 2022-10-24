package ss13_sort_algorithms.thuc_hanh.bubble_sort;


import static ss13_sort_algorithms.thuc_hanh.bubble_sort.BubbleSortIncreasing.bubbleSort;

public class test {
    public static void main(String[] args) {
        int[] list = {12, 33, 44, 66, 88, 66, 112, 55};

        bubbleSort(list);

        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + " ");
        }
    }
}
