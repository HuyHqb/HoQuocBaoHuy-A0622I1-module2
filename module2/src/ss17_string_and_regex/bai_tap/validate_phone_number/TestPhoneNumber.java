package ss17_string_and_regex.bai_tap.validate_phone_number;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestPhoneNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your phone: ");
        String phoneNumber = sc.nextLine();

        String REGEX_PHONE_NUMBER = "^\\d{2}-([0]\\d{9})";
        Pattern pattern = Pattern.compile(REGEX_PHONE_NUMBER);
        Matcher matcher = pattern.matcher(phoneNumber);

        if (matcher.matches()) {
            System.out.println("valid!");
        } else {
            System.out.println("invalid!");
        }
    }

}
