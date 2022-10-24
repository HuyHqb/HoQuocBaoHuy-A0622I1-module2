package ss14_exception.bai_tap.class_illegalTriangleExceptionAssignment;

import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TriangleEdgesCheck triangleEdgesCheck = new TriangleEdgesCheck();
        try {
            System.out.print("Nhập vào cạnh thứ nhất: ");
            int a = sc.nextInt();
            System.out.print("Nhập vào cạnh thứ Hai: ");
            int b = sc.nextInt();
            System.out.print("Nhập vào cạnh thứ ba: ");
            int c = sc.nextInt();

            TriangleEdgesCheck check = new TriangleEdgesCheck();

            try {
                check.checkTriangleEdges(a, b, c);
            } catch (TriangleEdgesException ex) {
                System.out.println(ex.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Không đúng định dạng");
        }
        sc.close();
    }

    public static class TriangleEdgesCheck {
        public void checkTriangleEdges(double a, double b, double c) throws TriangleEdgesException {
            if (a + b <= c || a + c <= b || b + c <= a) {
                throw new TriangleEdgesException("lỗi! tam giác không hợp lệ");
            } else {
                System.out.println("Tam giác hợp lệ");
            }
        }
    }
}
