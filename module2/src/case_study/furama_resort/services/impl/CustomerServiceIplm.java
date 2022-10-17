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

    static {
        Customer ctm1 = new Customer(1, "Hùng", 32, "Nam", "2031", "hung123@gmail.com", "VIP", "Đà Nẵng");
        Customer ctm2 = new Customer(2, "Thảo", 32, "Nữ", "2033", "Thao@gmail.com", "Normal", "Quảng Nam");
        Customer ctm3 = new Customer(3, "Huy", 32, "Nam", "20231", "huy123@gmail.com", "VIP", "Huế");
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

    @Override
    public void addNew() {
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tính: ");
        String sex = scanner.nextLine();
        System.out.println("Nhập Chứng minh: ");
        String idCard = scanner.nextLine();
        System.out.println("Nhập email: ");
        String email = scanner.nextLine();
        System.out.println("Nhập chức vụ: ");
        String type = scanner.nextLine();
        System.out.println("Nhập vị trí: ");
        String address = scanner.nextLine();
        Customer customer = new Customer(id, name, age, sex, idCard, email, type, address);
        customerList.add(customer);
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }
}
