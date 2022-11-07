package ss15_java_io.bai_tap.read_file_csv;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadCsv {

    public static List<Country> readFile(String filename) {
        List<Country> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                if (line.trim().equals("")) {
                    continue;
                }
                list.add(new Country(line));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void writeFile(List<Country> accountList, String filename) {
        try (BufferedWriter buffered = new BufferedWriter(new FileWriter(filename, false))) {
            for (Country country : accountList) {
                buffered.write(country.getInfo());
                buffered.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
