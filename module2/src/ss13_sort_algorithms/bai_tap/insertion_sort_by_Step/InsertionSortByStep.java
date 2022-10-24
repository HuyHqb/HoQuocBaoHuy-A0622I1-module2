package ss13_sort_algorithms.bai_tap.insertion_sort_by_Step;

public class InsertionSortByStep {
    static int[] list = {-19, -2, 8, 9, 16, -102, 30, 40};

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
        insertionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");

        }
    }
}
