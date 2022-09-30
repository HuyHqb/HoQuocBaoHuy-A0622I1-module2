package ss7_abstract_class_and_interface.bai_tap.interface_colorable_for_shape;


import ss7_abstract_class_and_interface.bai_tap.interface_resizeable_for_shape.Resizeable;

//khai báo lớp cha circle
public class Circle extends Shape implements Resizeable {
    private double radius;

    //constructor 2 tham số
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return radius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                " radius= " + radius +
                " area= " +
                '}';
    }

    @Override
    public void Resize(double percent) {
        System.out.println(getPerimeter() * percent);
    }
}




