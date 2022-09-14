package Ss3_array_and_methods_in_java;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int[] arrA = {5, 6, 7, 8, 9};
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số bạn muốn kiểm tra:  ");
        number = sc.nextInt();

        //tìm vị trí số nhập vào
        int position = searchElement(arrA, number);
        System.out.println(position);

        if (position == -1) {
            System.out.println("không tìm thấy " + number + " trong mảng");
        } else {
           int[] newArr=  deleteArray(arrA, position);
            for (int n : newArr) {
                System.out.print(n + " ");
            }
        }
    }

    //hàm tìm vị trí
    public static int searchElement(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

    //hàm xóa phần tử
    public static int[] deleteArray(int[] arr, int pos) {
        int[] result = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++)
            if (i < pos) {
                result[i] = arr[i];
            } else{
                result[i] = arr[i + 1];
            }
        return result;
    }
}


