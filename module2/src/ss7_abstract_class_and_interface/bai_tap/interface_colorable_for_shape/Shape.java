package ss7_abstract_class_and_interface.bai_tap.interface_colorable_for_shape;

import ss7_abstract_class_and_interface.bai_tap.interface_resizeable_for_shape.Resizeable;

public abstract class Shape implements Resizeable {
    private String color = "blue";
    private boolean filled = true;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    //truu tuong lay dien tich
    public abstract double getArea();

    //truu tuong lay chu vi
    public abstract double getPerimeter();


    @Override
    public String toString() {
        return "A Shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }


}

