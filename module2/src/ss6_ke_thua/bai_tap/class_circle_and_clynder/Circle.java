package ss6_ke_thua.bai_tap.class_circle_and_clynder;


//khai báo lớp cha circle
public class Circle {
    protected double radius;
    protected String color;
//constructor 2 tham số
    public Circle(double radius,String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", are=" + getArea()+
                '}';
    }
}




