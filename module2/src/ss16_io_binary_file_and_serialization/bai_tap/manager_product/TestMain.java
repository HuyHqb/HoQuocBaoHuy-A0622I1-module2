package ss16_io_binary_file_and_serialization.bai_tap.manager_product;

import java.util.ArrayList;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("CPT", "Computer", "LG", 200, "White Color"));
        productList.add(new Product("DL16", "Display", "ASUS", 50, "FHD/16 Inch"));
        productList.add(new Product("WM22", "Wash Machine", "Panasonic", 100, "Vertical"));
        productList.add(new Product("LS22", "Loudspeaker", "JBL", 50, "Water Resistance"));

        IoBinary.writeFileOptimize(productList, "ProductList.txt");
        IoBinary.readFile("ProductList.txt");
        productList.forEach(System.out::println);
    }
}
