package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số bạn muốn kiểm tra:  ");
        number = sc.nextInt();

        // kiểm tra số nguyên tố
        if (number < 2) {
            System.out.println(number + " không phải là số nguyên tố");
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    flag = false; //cờ sai thì không phải
                    break;
                }
            }

            if (flag) {
                System.out.println(number + " là số nguyên tố");
            } else
                System.out.println(number + " không phải là số nguyên tố");
        }
    }
}
