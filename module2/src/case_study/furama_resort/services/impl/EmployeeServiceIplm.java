package case_study.furama_resort.services.impl;

import case_study.furama_resort.models.Employee;
import case_study.furama_resort.services.EmployeeService;

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
        for (Employee emp : employeeList
        ) {
            if (editEmp == emp.getId()) {
                System.out.println("Nhập id mới: ");
                int newId = Integer.parseInt(scanner.nextLine());
                emp.setId(newId);
                System.out.println("Nhập tên mới: ");
                String newName = scanner.nextLine();
                emp.setName(newName);
                System.out.println("Nhập tuổi mới: ");
                int newAge = Integer.parseInt(scanner.nextLine());
                emp.setAge(newAge);
                System.out.println("Nhập giới tính: ");
                String newSex = scanner.nextLine();
                emp.setSex(newSex);
                System.out.println("Nhập Chứng minh mới: ");
                String newIdCard = scanner.nextLine();
                emp.setIdCard(newIdCard);
                System.out.println("Nhập email mới: ");
                String newEmail = scanner.nextLine();
                emp.setEmail(newEmail);
                System.out.println("Nhập chức vụ mới: ");
                String newLevel = scanner.nextLine();
                emp.setLevel(newLevel);
                System.out.println("Nhập vị trí mới: ");
                String newPosition = scanner.nextLine();
                emp.setPosition(newPosition);
                System.out.println("Nhập mức lương mới: ");
                int newSalary = Integer.parseInt(scanner.nextLine());
                emp.setSalary(newSalary);
                display();
            }
        }
    }


    @Override
    public void delete() {
        System.out.println("nhập ID nhân viên bạn muốn xóa: ");
        int checkId = scanner.nextInt();
        boolean flag = false;
        for (Employee emp : employeeList
        ) {
            if (checkId == emp.getId()) {
                employeeList.remove(emp);
                flag = true;
                break;
            }
        }
        if (flag == false) {
            System.out.println("Không tồn tại nhân viên có mã ID là : " + checkId);
        }
        display();
    }
}


