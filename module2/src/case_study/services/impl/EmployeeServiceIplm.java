package case_study.services.impl;

import case_study.models.Employee;
import case_study.services.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceIplm implements EmployeeService {
    private static final List<Employee> employeeList = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    static {
        Employee emp1 = new Employee(1, "Huy", 12, "nam", "a12", "asd@gmail.com", "CEO", "asd", 12300);
        Employee emp2 = new Employee(2, "Vu", 12, "nam", "123", "asd2@gmail.com", "CEO", "asd", 123);
        Employee emp3 = new Employee(3, "Teo", 12, "nam", "124", "asd1@gmail.com", "CEO", "asd", 123);
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
    }


    @Override
    public void display() {
        for (Employee employee : employeeList
        ) {
            System.out.println(employee.toString());
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
        String level = scanner.nextLine();
        System.out.println("Nhập vị trí: ");
        String position = scanner.nextLine();
        System.out.println("Nhập lương: ");
        int salary = Integer.parseInt(scanner.nextLine());
        Employee employee = new Employee(id, name, age, sex, idCard, email, level, position, salary);
        employeeList.add(employee);
    }

    @Override
    public void edit() {
        System.out.println("Nhập id nhân viên bạn muốn sửa: ");
        int editEmp = scanner.nextInt();
        for (Employee employee : employeeList
        ) {
            if (editEmp == employee.getId()) {

            }
        }

    }

    @Override
    public void delete() {

    }

}
