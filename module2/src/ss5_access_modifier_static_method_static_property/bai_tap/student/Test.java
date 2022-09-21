package ss5_access_modifier_static_method_static_property.bai_tap.student;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        // test public and private static
        System.out.println(student.name);
        student.setClasses("c03");
        System.out.println(student);

    }
}
