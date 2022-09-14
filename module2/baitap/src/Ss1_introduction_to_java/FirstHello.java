package Ss1_introduction_to_java;

import java.util.Scanner;

public class FirstHello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input your name: ");
        String name = sc.nextLine();

        System.out.println("hello " + name);

    }
}
