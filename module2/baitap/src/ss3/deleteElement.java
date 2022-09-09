package ss3;

import java.util.Arrays;
import java.util.Scanner;

public class deleteElement {
    public static void main(String[] args) {
        int[] arrA = {5, 6, 7, 8, 9};
        int del = 0;
        int number;

        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số bạn muốn kiểm tra:  ");
        number = sc.nextInt();

        for (int i = 0; i <= arrA.length; i++) {
            if (number == arrA[i]) {
                del = i;
                break;
            }
        }
        System.out.println(del);

        for (int i = del; i <= arrA.length - 1; i++) {
            arrA[del] = arrA[del + 1];
            del++;
            if (del == arrA.length - 1) {
                break;
            }
        }

        for (int i = 0; i < arrA.length - 1; i++) {
            System.out.print(arrA[i] + " ");
        }
    }
}
