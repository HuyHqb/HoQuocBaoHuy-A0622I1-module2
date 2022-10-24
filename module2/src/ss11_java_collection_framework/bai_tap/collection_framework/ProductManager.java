package ss11_java_collection_framework.bai_tap.collection_framework;

import case_study.furama_resort.models.Employee;

import java.util.*;

public class ProductManager {

    static ArrayList<Product> listProduct = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    static {
        Product prd1 = new Product(1, "Laptop", 160);
        Product prd2 = new Product(2, "TV", 50);
        Product prd3 = new Product(3, "Máy Giặt", 90);
        listProduct.add(prd1);
        listProduct.add(prd2);
        listProduct.add(prd3);
    }

    public void displayMainMenu() {
        boolean check = true;

        while (check) {
            System.out.println("------PRODUCT MANAGEMENT------");
            System.out.println("1. Add product");
            System.out.println("2. Edit product");
            System.out.println("3. Delete product");
            System.out.println("4. Display all product");
            System.out.println("5. Search by name");
            System.out.println("6. Increase Sort by price ");
            System.out.println("7. decrease Sort by price");
            System.out.println("Enter your choice: ");
            Scanner sc = new Scanner(System.in);
            int choice = 0;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("you entered the wrong format, please type again from 1 to 7 :");
            }
            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    editProduct();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    display();
                    break;
                case 5:
                    searchProductByName();
                    break;
                case 6:
                    sortByPriceIncreasing();
                    break;
                case 7:
                    sortByPriceDecreasing();
                    break;
            }
        }
    }


    public void display() {
        for (Product product : listProduct
        ) {
            System.out.println(product);
        }
    }

    public void addProduct() {
        System.out.println("Nhập id sản phẩm: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("nhập tên sản phẩm: ");
        String name = sc.nextLine();
        System.out.println("nhập giá: ");
        int price = sc.nextInt();

        Product product = new Product(id, name, price);
        listProduct.add(product);

        display();
    }

    void editProduct() {
        System.out.println("Nhập id sản phẩm bạn muốn sửa: ");
        Integer checkId = Integer.parseInt(sc.nextLine());

        for (Product product : listProduct
        ) {
            if (checkId.equals(product.getId())) {
                System.out.println("Nhập id mới của sản phẩm: ");
                int newId = Integer.parseInt(sc.nextLine());
                System.out.println("nhập tên mới sản phẩm: ");
                String newName = sc.nextLine();
                System.out.println("nhập giá mới: ");
                int newPrice = sc.nextInt();

                product.setId(newId);
                product.setName(newName);
                product.setPrice(newPrice);
            }
        }

        display();
    }

    void deleteProduct() {
        System.out.println("nhập ID sản phẩm bạn muốn xóa: ");
        Integer checkId = sc.nextInt();
        boolean flag = false;
        for (Product product : listProduct
        ) {
            if (checkId.equals(product.getId())) {
                listProduct.remove(product);
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("Không tồn tại sản phẩm có id là  : " + checkId);
        } else System.out.println("Đã xóa thành công");
        display();
    }

    void searchProductByName() {
        System.out.println("Nhập tên sản phẩm bạn muốn tìm: ");
        String checkName = sc.nextLine();
        boolean flag = false;
        int count = 0;
        for (Product product : listProduct
        ) {
            if (checkName.equals(product.getName())) {
                System.out.println(product);
                count++;
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("không tồn tại sản phẩm có tên là: " + checkName);
        } else System.out.println("có " + count + " sản phẩm có tên là: " + checkName);
    }

    void sortByPriceIncreasing() {
        Collections.sort(listProduct);
        display();
    }

    void sortByPriceDecreasing() {
        Collections.sort(listProduct, new ComparatorProductPrice());
        display();
    }

}
