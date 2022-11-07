package ss15_java_io.bai_tap.read_file_csv;

import java.util.ArrayList;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        List<Country> countries = new ArrayList<>();
        countries.add(new Country(1, "Au", "Australia"));
        countries.add(new Country(2, "Ger", "Germany"));
        countries.add(new Country(3, "italy", "Italia"));
        countries.add(new Country(4, "Eng", "England"));

        ReadCsv.writeFile(countries, "D:\\Codegym\\module2\\src\\ss15_java_io\\bai_tap\\read_file_csv\\countries.csv");
        List<Country> countryList = ReadCsv.readFile("D:\\Codegym\\module2\\src\\ss15_java_io\\bai_tap\\read_file_csv\\countries.csv");
        countryList.forEach(System.out::println);
    }
}
