package case_study.furama_resort.services.impl;

import case_study.furama_resort.models.Employee;
import case_study.furama_resort.services.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceIplm implements EmployeeService {
    private static final List<Employee> employeeList = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);
    final static String[] stringSex = {"nam", "nữ", "khác"};
    final static String[] stringPosition = {"lễ lân", "phục vụ", "chuyen vien", "giám sát", "quản lý", "giám đốc"};
    final static String[] stringLevel = {"trung cấp", "cao đẳng", "đại học", "sau đại học"};

    static {
        Employee emp1 = new Employee(1, "Huy", 12, "nam", "a12", "asd@gmail.com", "trung cấp", "asd", 12300);
        Employee emp2 = new Employee(2, "Vu", 12, "nam", "123", "asd2@gmail.com", "đại học", "asd", 123);
        Employee emp3 = new Employee(3, "Teo", 12, "nam", "124", "asd1@gmail.com", "giám đốc", "asd", 123);
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
    }

    public boolean checkSex(String input) {
        for (int i = 0; i < stringSex.length - 1; i++) {
            if (input.equals(stringSex[i])) {
                return true;
            }
        }
        return false;
    }

    public boolean checkLevel(String input) {
        for (int i = 0; i < stringLevel.length - 1; i++) {
            if (input.equals((stringLevel[i]))) {
                return true;
            }
        }
        return false;
    }

    public boolean checkPosition(String input) {
        for (int i = 0; i < stringPosition.length - 1; i++) {
            if (input.equals((stringPosition[i]))) {
                return true;
            }
        }
        return false;
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

        // kiểm tra chuỗi nhập vào có đúng không
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

        // kiểm tra chuỗi nhập vào có đúng không
        System.out.println("Nhập trình độ: ");
        System.out.println("(trung cấp, cao đẳng, đại học, sau đại học)");
        String level = scanner.nextLine();
        while (!checkLevel(level)) {
            System.out.println("trình độ không hợp lệ vui lòng nhập lại");
            level = scanner.nextLine();
        }

        // kiểm tra chuỗi nhập vào có đúng không
        System.out.println("Nhập vị trí: "); //
        System.out.println("(lễ lân, phục vụ,chuyen vien, giám sát,quản lý,giám đốc)");
        String position = scanner.nextLine();
        while (!checkLevel(level)) {
            System.out.println("vị trí không hợp lệ vui lòng nhập lại");
            position = scanner.nextLine();
        }
        System.out.println("Nhập lương: ");
        int salary = Integer.parseInt(scanner.nextLine());
        Employee employee = new Employee(id, name, age, sex, idCard, email, level, position, salary);
        employeeList.add(employee);
    }

    @Override
    public void edit() {
        System.out.println("Nhập id nhân viên bạn muốn sửa: ");
        int editEmp = Integer.parseInt(scanner.nextLine());
        for (Employee emp : employeeList
        ) {
            if (editEmp == emp.getId()) {
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
                System.out.println("Nhập trình độ mới: ");
                System.out.println("trung cấp, cao đẳng, đại học, sau đại học");
                String newLevel = scanner.nextLine();
                while (!checkLevel(newLevel)) {
                    System.out.println("trình độ không hợp lệ vui lòng nhập lại");
                    newLevel = scanner.nextLine();
                }
                System.out.println("Nhập vị trí mới: ");
                System.out.println("lễ lân, phục vụ,chuyen vien, giám sát,quản lý,giám đốc");
                String newPosition = scanner.nextLine();
                while (!checkLevel(newPosition)) {
                    System.out.println("vị trí không hợp lệ vui lòng nhập lại");
                    newPosition = scanner.nextLine();
                }
                System.out.println("Nhập mức lương mới: ");
                int newSalary = Integer.parseInt(scanner.nextLine());

                emp.setId(newId);
                emp.setName(newName);
                emp.setAge(newAge);
                emp.setSex(newSex);
                emp.setIdCard(newIdCard);
                emp.setEmail(newEmail);
                emp.setLevel(newLevel);
                emp.setPosition(newPosition);
                emp.setSalary(newSalary);
                break;
            }
        }
        display();
    }


    @Override
    public void delete() {
        System.out.println("nhập ID nhân viên bạn muốn xóa: ");
        Integer checkId = scanner.nextInt();
        boolean flag = false;
        for (Employee emp : employeeList
        ) {
            if (checkId.equals(emp.getId())) {
                employeeList.remove(emp);
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("Không tồn tại nhân viên có mã ID là : " + checkId);
        } else System.out.println("Đã xóa thành công");
        display();
    }
}


