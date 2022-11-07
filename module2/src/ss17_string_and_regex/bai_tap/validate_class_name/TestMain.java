package ss17_string_and_regex.bai_tap.validate_class_name;


public class TestMain {
    private static ValidateClassName validateClassName;
    public static final String[] validClassName = new String[]{"C0318G", "A0949K", "P1234L"};
    public static final String[] invalidClassName = new String[]{"M0318G", "P0323A.", "m1234q"};

    public static void main(String[] args) {
        validateClassName = new ValidateClassName();
        for (String className : validClassName) {
            boolean isvalid = validateClassName.validate(className);
            System.out.println("Class name is " + className + " is valid: " + isvalid);
        }
        for (String className : invalidClassName) {
            boolean isvalid = validateClassName.validate(className);
            System.out.println("class name is " + className + " is valid: " + isvalid);
        }
    }

}
