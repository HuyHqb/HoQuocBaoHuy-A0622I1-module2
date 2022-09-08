package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        String[] donVi = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] chuc = {"ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        System.out.println("input you number: ");
        int number = Scanner.nextInt();
        int ones = (number % 100) % 10;
        int tens = (number % 100) / 10;
        int hundreds = number / 100;

        if (hundreds >= 1) {
            System.out.println(donVi[hundreds] + " Hundred" + (tens == 0 ? "" : (" And " + chuc[tens - 1]))
                    + (ones == 0 ? "" : (" " + donVi[ones])));
        } else if (tens == 1) {
            switch (ones) {
                case 0:
                    System.out.println(chuc[ones]);
                    break;
                case 1:
                    System.out.println("eleven");
                    break;
                case 2:
                    System.out.println("twele");
                    break;
                case 3:
                    System.out.println("thirteen");
                    break;
                case 4:
                    System.out.println("fourteen");
                    break;
                case 5:
                    System.out.println("fifteen");
                    break;
                case 6:
                    System.out.println("sexteen");
                    break;
                case 7:
                    System.out.println("seventeen");
                    break;
                case 8:
                    System.out.println("eightteen");
                    break;
                case 9:
                    System.out.println("nineteen");
                    break;
            }
        } else if (tens > 1) {
            System.out.println(chuc[tens - 1] + (ones == 0 ? "" : (" " + donVi[ones])));
        } else if (tens < 1) {
            System.out.println(donVi[ones]);
        }
    }
}




