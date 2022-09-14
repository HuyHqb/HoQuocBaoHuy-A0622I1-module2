package ss4.Rectangle;

import java.util.Scanner;

public class mainRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double width, height;
        width = sc.nextDouble();
        height = sc.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);
        System.out.println(rectangle.getArea());
    }
}
