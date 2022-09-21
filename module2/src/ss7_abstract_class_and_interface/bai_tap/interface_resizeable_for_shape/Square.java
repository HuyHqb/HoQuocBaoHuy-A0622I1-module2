package ss7_abstract_class_and_interface.bai_tap.interface_resizeable_for_shape;

public class Square extends Shape implements Resizeable, Colorable {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public Square() {
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    @Override
    public void Resize(double percent) {
        System.out.println(getPerimeter() * percent);
    }


    @Override
    public void howToColor() {
        System.out.println("Color all 4 sides");
    }
}
