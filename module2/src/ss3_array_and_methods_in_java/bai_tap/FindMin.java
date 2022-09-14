package ss3_array_and_methods_in_java.bai_tap;

import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = sc.nextInt();
        int arrA[] = new int[n];
        int min = arrA[0];
        for (int i = 0; i < arrA.length; i++) {
            System.out.println("Vui lòng nhập các phần tử thứ " + i + " của mảng: ");
            arrA[i] = sc.nextInt();
        }
       //tìm gtnn
        for (int i = 1; i < arrA.length; i++) {
            if(arrA[i]<min){
                min = arrA[i];
            }
        }
        for(int m: arrA){
            System.out.println(m+" ");
        }
        System.out.println("phần tử nhỏ nhất của mảng là: " + min);
    }
}
