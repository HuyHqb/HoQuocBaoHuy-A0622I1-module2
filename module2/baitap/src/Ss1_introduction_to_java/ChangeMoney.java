package Ss1_introduction_to_java;

import java.util.Scanner;

public class ChangeMoney {

    public static void main(String[] args) {
        double vnd = 23000, usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số usd bạn muốn đổi: ");
        usd = sc.nextDouble();
        double rate = usd*vnd;
        System.out.println("số tiền VND sau khi đổi " + usd + " USD là " + rate);

    }
}
