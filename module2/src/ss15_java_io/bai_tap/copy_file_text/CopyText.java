package ss15_java_io.bai_tap.copy_file_text;

import com.sun.source.tree.WhileLoopTree;

import java.io.*;

public class CopyText {
    public static void copyFiles(String file, String targetFile) throws FileNotFoundException {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        {
            try {
                bufferedReader = new BufferedReader(new FileReader(file));
                bufferedWriter = new BufferedWriter(new FileWriter(targetFile));
                int check;
                while ((check = bufferedReader.read()) != -1) {
                    System.out.print((char) check);
                    bufferedWriter.write(check);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (bufferedWriter != null) {
                    try {
                        bufferedWriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
