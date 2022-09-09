package com.codegym;

import java.util.Scanner;

public class Main {

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int size, n = 2;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số lượng số nguyên tố bạn muốn kiểm tra:  ");
        size = sc.nextInt();

        // kiểm tra số nguyên tố
        while (count < size) {
            if (isPrime(n)) {
                System.out.println(n);
                count++;
            }
            n++;
        }
    }
}

