package ss3;

public class combineArray {
    public static void main(String[] args) {
        int[] arrA = {5, 6, 7, 8, 9};
        int[] arrB = {20, 16, 47, 28, 19};


        int[] arrC = combineArr(arrA, arrB);

        for (int n : arrC) {
            System.out.print(n+" ");
        }
    }

    public static int[] combineArr(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int[] result = new int[m + n];
        for (int i = 0; i < m; i++) {
            result[i] = arr1[i];
        }
        for (int i = 0; i < n; i++) {
            result[m + i] = arr2[i];
        }
        return result;
    }
}
