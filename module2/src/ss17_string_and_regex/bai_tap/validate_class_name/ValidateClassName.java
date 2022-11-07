package ss17_string_and_regex.bai_tap.validate_class_name;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassName {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String CLASS_NAME_REGEX = "^[CAP]\\d{4}[GHIKLM]$";

    public ValidateClassName() {
        pattern = Pattern.compile(CLASS_NAME_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
