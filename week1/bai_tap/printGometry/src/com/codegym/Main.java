package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose one option: \n1. Rectangle \n2. Triangle \n3. Isosceles triangle");
        int input = sc.nextInt();
        System.out.println("input height");
        int h = sc.nextInt();

        //option1 in hcn
        if (input == 1) {
            System.out.println("input width");
            int w = sc.nextInt();

            for (int i = 1; i <= h; i++) {
                for (int j = 1; j <= w; j++) {
                    System.out.print(" * ");
                }
                System.out.println("\n");
            }
        }
        // option2 in tam giác vuông
        else if (input == 2) {
            System.out.println(" in tam giác vuông dưới bên trái");
            for (int i = 1; i <= h; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println("\n");
            }

            System.out.println(" in tam giác vuông trên bên trái");
            for (int i = h; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println("\n");
            }

            System.out.println(" in tam giác vuông DƯỚI bên phải");
            for (int i = 1; i <= h; i++) {
                for (int j = 0; j <= h - 1; j++) {
                    if (j < h - i) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.print("\n");
            }

            System.out.println(" in tam giác vuông trên bên phải");
            {
                for (int i = 0; i <= h; i++) {
                    for (int j = 0; j <= h - 1; j++) {
                        if (j >= i) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.print("\n");
                }
            }
        }
        //option 3 tam giác cân
        else if (input == 3) {
            for (int i = 1; i <= h; i++) {
                for (int j = h; j > i; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i * 2 - 1; k++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        }
    }
}
