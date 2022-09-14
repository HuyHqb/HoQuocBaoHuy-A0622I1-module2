package ss3_array_and_methods_in_java.bai_tap;

import java.util.Scanner;

public class AddElement {


    public static void main(String[] args) {
        int[] arrA = {5, 6, 7, 8, 9};
        Scanner sc = new Scanner(System.in);
        int number,index;
        System.out.println("nhập số bạn muốn thêm vào mảng:  ");
        number = sc.nextInt();
        System.out.println("nhập vị trí bạn muốn thêm số "+ number + " vào mảng");
        index=sc.nextInt();
        arrA = insertArray(arrA, number, index);

        for(int n: arrA) {
            System.out.print( n  + ",");
        }
    }


    //hàm thêm số vào mảng
    public static int[] insertArray(int[] arr, int k, int index) {
        int[] result = new int[arr.length + 1];
        for (int i = 0; i < result.length; i++) {
            if (i < index) {
                result[i] = arr[i];
            } else if (i == index) {
                result[i] = k;
            } else {
                result[i] = arr[i - 1];
            }
        }
        return result;
    }
}
