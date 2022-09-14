package Ss5_access_modifier_static_method_static_property.Student;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        // test public and private static
        System.out.println(student.name);
        System.out.println(student.name1);
    }
}
