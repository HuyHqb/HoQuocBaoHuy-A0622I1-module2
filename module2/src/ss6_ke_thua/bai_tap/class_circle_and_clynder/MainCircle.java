package ss6_ke_thua.bai_tap.class_circle_and_clynder;

public class MainCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(5,"Blue");
        Cylinder cylinder = new Cylinder(5,"red",2);
        System.out.println(circle.toString());
        System.out.println(cylinder.toString());
    }
}
