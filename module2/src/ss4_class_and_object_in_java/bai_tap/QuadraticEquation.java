package ss4_class_and_object_in_java.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    //constructor
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    // tính delta
    public double getDiscriminant(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        return delta;
    }

    //tính nghiệm thứ 1
    public double getRoot1(double a, double b, double c) {
        double r = (-b + Math.sqrt(getDiscriminant(a, b, c))) / 2 * a;
        return r;
    }

    // tính nghiệm thứ 2
    public double getRoot2(double a, double b, double c) {
        double r = (b + Math.sqrt(getDiscriminant(a, b, c))) / 2 * a;
        return r;
    }

    //Nghiệm duy nhất
    public double getUnique(double a, double b, double c) {
        double u = (-b) / (2 * a);
        return u;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số a ");
        double a = sc.nextDouble();
        System.out.println("nhập số b ");
        double b = sc.nextDouble();
        System.out.println("nhập số c ");
        double c = sc.nextDouble();

        //gọi lớp mới
        QuadraticEquation quadra = new QuadraticEquation(a, b, c);
        double r1 = quadra.getRoot1(a, b, c);
        double r2 = quadra.getRoot2(a, b, c);
        double delta = quadra.getDiscriminant(a, b, c);
        double unique = quadra.getUnique(a, b, c);
        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (delta == 0) {
            System.out.println("Phương trình có 1 nghiệm duy nhất là x = " + unique);
        } else {
            System.out.println("phương trình có 2 nghiệm phân biệt" + "\n" + "x1 = " + r1 + "\n" + "x2 = " + r2);
        }
    }
}
