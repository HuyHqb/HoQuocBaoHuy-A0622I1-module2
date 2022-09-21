package ss7_abstract_class_and_interface.bai_tap.interface_resizeable_for_shape;

public class Test {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle(5, 10);
        shapes[1] = new Circle(5);
        shapes[2] = new Square(5);

        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                System.out.println("kích thước trước khi tăng : " + shape.getPerimeter());
                Resizeable resize = shape;
                System.out.print("kich thước sau khi tăng : ");
                resize.Resize(Math.random() * 100);
            } else if (shape instanceof Rectangle) {
                System.out.println("kích thước trước khi tăng : " + shape.getPerimeter());
                Resizeable resize = shape;
                System.out.print("kich thước sau khi tăng : ");
                resize.Resize(Math.random() * 100);
            } else {
                System.out.println("kích thước trước khi tăng : " + shape.getPerimeter());
                Square resize = (Square) shape;
                System.out.print("kich thước sau khi tăng : ");
                resize.Resize(Math.random() * 100);
                resize.howToColor();
            }
        }
    }
}
