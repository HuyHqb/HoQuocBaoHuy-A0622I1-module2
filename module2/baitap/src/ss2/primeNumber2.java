package ss2;

import java.util.Scanner;

public class primeNumber2 {

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        int n = 2;
        int count = 0;
        Scanner sc = new Scanner(System.in);

        // kiểm tra số nguyên tố
        while (n < 100) {
            if (isPrime(n)) {
                System.out.println(n);
            }
            n++;
        }
    }
}

