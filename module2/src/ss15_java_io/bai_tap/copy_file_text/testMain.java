package ss15_java_io.bai_tap.copy_file_text;

import java.io.FileNotFoundException;

public class testMain {
    public static void main(String[] args) throws FileNotFoundException {
        CopyText.copyFiles("D:\\Codegym\\module2\\src\\ss15_java_io\\bai_tap\\copy_file_text\\test.txt", "D:\\Codegym\\module2\\src\\ss15_java_io\\bai_tap\\copy_file_text\\test_cp.txt");
    }
}
