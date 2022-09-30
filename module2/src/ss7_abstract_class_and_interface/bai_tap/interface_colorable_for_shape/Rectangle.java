package ss7_abstract_class_and_interface.bai_tap.interface_colorable_for_shape;

import ss7_abstract_class_and_interface.bai_tap.interface_resizeable_for_shape.Resizeable;

public class Rectangle extends Shape implements Resizeable {
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
    }


    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }

    @Override
    public double getPerimeter() {
        return (this.height + this.width) * 2;
    }

    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "area is : " + getArea() + "}";
    }


    @Override
    public void Resize(double percent) {
        System.out.println(getPerimeter() * percent);
    }
}
