package ss6_ke_thua.bai_tap.class_circle_and_clynder;

//khai báo lớp con cylinder
public class Cylinder extends Circle {
    protected double height;

    //constructor 2 tham số
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }


    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return Math.pow(radius, 2) * Math.PI * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", height=" + height +
                ", Volume=" + getVolume()+
                '}';
    }
}
