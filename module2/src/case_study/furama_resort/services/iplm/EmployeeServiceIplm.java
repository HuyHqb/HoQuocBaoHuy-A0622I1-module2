package case_study.furama_resort.services.iplm;

import case_study.furama_resort.models.Customer;
import case_study.furama_resort.models.Employee;
import case_study.furama_resort.services.EmployeeService;
import case_study.furama_resort.utils.ReadAndWrite;
import case_study.furama_resort.utils.RegexData;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceIplm implements EmployeeService {
    private static List<Employee> employeeList = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);
    final static String[] stringSex = {"nam", "nữ", "khác"};
    final static String[] stringPosition = {"lễ lân", "phục vụ", "chuyen vien", "giám sát", "quản lý", "giám đốc"};
    final static String[] stringLevel = {"trung cấp", "cao đẳng", "đại học", "sau đại học"};
    final static String REGEX_BIRTHDAY = "(^(((0[1-9]|1[0-9]|2[0-8])[\\/](0[1-9]|1[012]))|((29|30|31)[\\/](0[13578]|1[02]))|((29|30)[\\/](0[4,6,9]|11)))[\\/](19|[2-9][0-9])\\d\\d$)|(^29[\\/]02[\\/](19|[2-9][0-9])(00|04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)$)";
    final static String REGEX_EMAIL = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    final static String REGEX_SEX = "^(nam)|(nu)$";
//    static {
//
//        Employee emp1 = new Employee(1, "Huy", "21/12/1998", "nam", "a12", "asd@gmail.com", "trung cấp", "asd", 12300);
//        Employee emp2 = new Employee(2, "Vu", "15/03/2000", "nam", "123", "asd2@gmail.com", "đại học", "asd", 123);
//        Employee emp3 = new Employee(3, "Teo", "25/10/1999", "nam", "124", "asd1@gmail.com", "giám đốc", "asd", 123);
//        employeeList.add(emp1);
//        employeeList.add(emp2);
//        employeeList.add(emp3);
//    }

    public boolean checkSex(String input) {
        for (int i = 0; i < stringSex.length - 1; i++) {
            if (input.equals(stringSex[i])) {
                return true;
            }
        }
        return false;
    }

    private String inputEmail() {
        System.out.println("Nhập email:");
        return RegexData.regexStr(scanner.nextLine(), REGEX_EMAIL, "Email không đúng định dạng!, vui lòng nhập lại");
    }

    public boolean checkLevel(String input) {
        for (int i = 0; i < stringLevel.length - 1; i++) {
            if (input.equals((stringLevel[i]))) {
                return true;
            }
        }
        return false;
    }

    public String inputSex() {
        System.out.println("Nhập giới tính: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_SEX, "giới tính không đúng định dạng!, vui lòng nhập lại");
    }


    @Override
    public void display() {
        employeeList = ReadAndWrite.readFileEmp("D:\\Codegym\\module2\\src\\case_study\\furama_resort\\data\\employee.csv");
        for (Employee employee : employeeList
        ) {
            System.out.println(employee.toString());
        }
    }

    @Override
    public void addNew() throws IOException {
        System.out.println("Nhập id: ");
        Integer id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh: ");
        System.out.println("vui lòng nhập đúng định dạng dd/mm/YYYY: ");
        String age = RegexData.regexAge(scanner.nextLine(), REGEX_BIRTHDAY);
        // kiểm tra chuỗi nhập vào có đúng không
//        System.out.println("Nhập giới tính (nam/nữ/khác): ");
//        String sex = scanner.nextLine();
////        while (!checkSex(sex)) {
////            System.out.println("giới tính không hợp lệ vui lòng nhập lại");
////            sex = scanner.nextLine();
////        }
        String sex = inputSex();

        System.out.println("Nhập Chứng minh: ");
        String idCard = scanner.nextLine();
        String email = inputEmail();
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
        ReadAndWrite.writeFileEmp(employeeList, "D:\\Codegym\\module2\\src\\case_study\\furama_resort\\data\\employee.csv");
    }


    @Override
    public void edit() {
        System.out.println("Vui lòng nhập ID nhân viên bạn muốn sửa thông tin: ");
        Integer editId = Integer.parseInt(scanner.nextLine());
        for (Employee emp : employeeList
        ) {
            if (editId.equals(emp.getId())) {
                boolean check = true;
                while (check) {
                    System.out.println("Vui lòng chọn thông tin bạn muốn sửa: ");
                    System.out.println("1. Tên ");
                    System.out.println("2. Tuổi ");
                    System.out.println("3. Giới Tính ");
                    System.out.println("4. CMND ");
                    System.out.println("5. Email");
                    System.out.println("6. Trình độ ");
                    System.out.println("7. Vị trí ");
                    System.out.println("8. Lương ");
                    System.out.println("9. Quay lại ");
                    System.out.println();
                    int choice = 0;
                    try {
                        choice = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("you entered the wrong format, please type again from 1 to 9 :");
                    }
                    switch (choice) {
                        case 1:
                            System.out.println("Nhập tên mới: ");
                            String newName = scanner.nextLine();
                            emp.setName(newName);
                            System.out.println("sửa thành công ");
                            System.out.println(emp);
                            break;
                        case 2:
                            System.out.println("Nhập tuổi mới: ");
                            String newAge = RegexData.regexAge(scanner.nextLine(), REGEX_BIRTHDAY);
                            emp.setAge(newAge);
                            System.out.println("sửa thành công ");
                            System.out.println(emp);
                            break;
                        case 3:
                            System.out.println("Nhập giới tính: ");
                            String newSex = scanner.nextLine();
                            while (!checkSex(newSex)) {
                                System.out.println("giới tính không hợp lệ vui lòng nhập lại");
                                newSex = scanner.nextLine();
                            }
                            emp.setSex(newSex);
                            System.out.println("sửa thành công ");
                            System.out.println(emp);
                            break;
                        case 4:
                            System.out.println("Nhập Chứng minh mới: ");
                            String newIdCard = scanner.nextLine();
                            emp.setIdCard(newIdCard);
                            System.out.println("sửa thành công ");
                            System.out.println(emp);
                            break;
                        case 5:
                            System.out.println("Nhập email mới: ");
                            String newEmail = inputEmail();
                            emp.setEmail(newEmail);
                            System.out.println("sửa thành công ");
                            System.out.println(emp);
                            break;
                        case 6:
                            System.out.println("Nhập trình độ mới: ");
                            System.out.println("trung cấp, cao đẳng, đại học, sau đại học");
                            String newLevel = scanner.nextLine();
                            while (!checkLevel(newLevel)) {
                                System.out.println("trình độ không hợp lệ vui lòng nhập lại");
                                newLevel = scanner.nextLine();
                            }
                            emp.setEmail(newLevel);
                            System.out.println("sửa thành công ");
                            System.out.println(emp);
                            break;
                        case 7:
                            System.out.println("Nhập vị trí mới: ");
                            System.out.println("lễ lân, phục vụ,chuyen vien, giám sát,quản lý,giám đốc");
                            String newPosition = scanner.nextLine();
                            while (!checkLevel(newPosition)) {
                                System.out.println("vị trí không hợp lệ vui lòng nhập lại");
                                newPosition = scanner.nextLine();
                            }
                            break;
                        case 8:
                            System.out.println("Nhập Lương mới: ");
                            int newSlary = Integer.parseInt(scanner.nextLine());
                            emp.setSalary(newSlary);
                            System.out.println("sửa thành công ");
                            System.out.println(emp);
                            break;
                        case 9:
                            break;
                    }
                    if (choice == 9) {
                        check = false;
                    }
                }
            }
        }
    }


    @Override
    public void delete() {
        System.out.println("nhập ID nhân viên bạn muốn xóa: ");
        Integer checkId = scanner.nextInt();
        boolean flag = false;
        for (Employee emp : employeeList
        ) {
            if (checkId.equals(emp.getId())) {
                System.out.println("Bạn có muốn xóa nhân viên có mã ID là: " + checkId + " không?");
                System.out.println("1: Có.");
                System.out.println("2: Không.");
                int checkDel = scanner.nextInt();
                switch (checkDel) {
                    case 1:
                        employeeList.remove(emp);
                        System.out.println("Đã xóa thành công");
                        break;
                    case 2:
                        System.out.println("Không xóa");
                        break;
                }
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("Không tồn tại nhân viên có mã ID là : " + checkId);
        }
        display();
    }
}


