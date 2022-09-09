package ss3;

import java.util.Scanner;

public class addElement {
    public static void main(String[] args) {
        int[] arrA = {5, 6, 7, 8, 9};
        int index,number;


        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số bạn muốn kiểm tra:  ");
        number = sc.nextInt();
        System.out.println("nhập vị trí bạn muốn chèn :  ");
        index = sc.nextInt();

        if(index<=1 || index>=arrA.length-1){
            System.out.println("cút");
        }for (int i = 0; i < arrA.length; i++) {
            
        }
    }
}
