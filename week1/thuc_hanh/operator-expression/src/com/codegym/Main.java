package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float width, height;
        Scanner Scanner = new Scanner(System.in);

        System.out.println("input width: ");
        width = Scanner.nextFloat();

        System.out.println("input height: ");
        height = Scanner.nextFloat();

        float area = width * height;
        System.out.println("area is " + area);

        

    }
}
