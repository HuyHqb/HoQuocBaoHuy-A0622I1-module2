package ss6_ke_thua.bai_tap.class_point_and_moveable_point;

public class TestPoint {
    public static void main(String[] args) {
        Point lopCha = new Point();
        MoveablePoint lopCon = new MoveablePoint();
        lopCha.setX(5);
        lopCha.setY(8);
//        lopCha.setXY(5,6);
        lopCon.setXY(5,7);
        lopCon.setSpeed(7,8);
        System.out.println(lopCon.move());
        System.out.println(lopCha);
        System.out.println(lopCon);
    }
}
