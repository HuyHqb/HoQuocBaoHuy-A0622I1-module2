package case_study.furama_resort.services.impl;

import case_study.furama_resort.models.Customer;
import case_study.furama_resort.models.Employee;
import case_study.furama_resort.services.CustomerService;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceIplm implements CustomerService {
    private static final LinkedList<Customer> customerList = new LinkedList<Customer>();
    private static final Scanner scanner = new Scanner(System.in);
    final static String[] stringSex = {"nam", "nữ", "khác"};
    final static String[] stringType = {"Diamond", "Platinium", "Gold", "Silver", "Member"};


    static {
        Customer ctm1 = new Customer(1, "Hùng", 32, "Nam", "2031", "hung123@gmail.com", "Gold", "Đà Nẵng");
        Customer ctm2 = new Customer(2, "Thảo", 32, "Nữ", "2033", "Thao@gmail.com", "Member", "Quảng Nam");
        Customer ctm3 = new Customer(3, "Huy", 32, "Nam", "20231", "huy123@gmail.com", "Silver", "Huế");
        customerList.add(ctm1);
        customerList.add(ctm2);
        customerList.add(ctm3);
    }

    @Override
    public void display() {
        System.out.println("Danh sách khách hàng : ");
        for (Customer ctm : customerList
        ) {
            System.out.println(ctm);
        }
    }

    public boolean checkSex(String input) {
        for (int i = 0; i < stringSex.length - 1; i++) {
            if (input.equals(stringSex[i])) {
                return true;
            }
        }
        return false;
    }

    public boolean checkType(String input) {
        for (int i = 0; i < stringType.length - 1; i++) {
            if (input.equals((stringType[i]))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void addNew() {
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tính (nam/nữ/khác): ");
        String sex = scanner.nextLine();
        while (!checkSex(sex)) {
            System.out.println("giới tính không hợp lệ vui lòng nhập lại");
            sex = scanner.nextLine();
        }
        System.out.println("Nhập Chứng minh: ");
        String idCard = scanner.nextLine();
        System.out.println("Nhập email: ");
        String email = scanner.nextLine();
        System.out.println("Nhập loại khách hàng: ");
        System.out.println("(Diamond, Platinium, Gold, Silver, Member)");
        String type = scanner.nextLine();
        while (!checkType(type)) {
            System.out.println("Loại khách hàng không hợp lệ vui lòng nhập lại");
            type = scanner.nextLine();
        }
        System.out.println("Nhập địa chỉ: ");
        String address = scanner.nextLine();
        Customer customer = new Customer(id, name, age, sex, idCard, email, type, address);
        customerList.add(customer);
    }

    @Override
    public void edit() {
        System.out.println("Vui lòng nhập ID khách hàng bạn muốn sửa thông tin: ");
        Integer editId = Integer.parseInt(scanner.nextLine());
        for (Customer ctm : customerList
        ) {
            if (editId.equals(ctm.getId())) {
                System.out.println("Nhập id mới: ");
                int newId = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập tên mới: ");
                String newName = scanner.nextLine();
                System.out.println("Nhập tuổi mới: ");
                int newAge = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập giới tính: ");
                String newSex = scanner.nextLine();
                while (!checkSex(newSex)) {
                    System.out.println("giới tính không hợp lệ vui lòng nhập lại");
                    newSex = scanner.nextLine();
                }
                System.out.println("Nhập Chứng minh mới: ");
                String newIdCard = scanner.nextLine();
                System.out.println("Nhập email mới: ");
                String newEmail = scanner.nextLine();

                System.out.println("Nhập loại khách hàng: ");
                System.out.println("(Diamond, Platinium, Gold, Silver, Member)");
                String newType = scanner.nextLine();
                while (!checkType(newType)) {
                    System.out.println("loại khách hàng không hợp lệ vui lòng nhập lại");
                    newType = scanner.nextLine();
                }
                System.out.println("Nhập địa chỉ mới: ");
                String newAddress = scanner.nextLine();

                ctm.setId(newId);
                ctm.setName(newName);
                ctm.setAge(newAge);
                ctm.setSex(newSex);
                ctm.setIdCard(newIdCard);
                ctm.setEmail(newEmail);
                ctm.setType(newType);
                ctm.setAddress(newAddress);
                break;
            }
        }


    }

    @Override
    public void delete() {
        System.out.println("vui lòng nhập mã khách hàng bạn muốn xóa: ");
        Integer checkId = scanner.nextInt();
        boolean flag = false;
        for (Customer ctm : customerList
        ) {
            if (checkId.equals(ctm.getId())) {
                customerList.remove(ctm);
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("không tồn tại mã khách hàng cần xóa");
        } else System.out.println("đã xóa thành công");
    }
}
