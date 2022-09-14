package Ss5_access_modifier_static_method_static_property.access_modifier;

public class Circle {
    private double radius=1.0;
    private String color="red";

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }


}

