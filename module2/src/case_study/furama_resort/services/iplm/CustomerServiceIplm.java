package case_study.furama_resort.services.iplm;

import case_study.furama_resort.models.Customer;
import case_study.furama_resort.services.CustomerService;
import case_study.furama_resort.utils.ReadAndWrite;
import case_study.furama_resort.utils.RegexData;

import java.util.LinkedList;
import java.util.Scanner;

public class CustomerServiceIplm implements CustomerService {
    private static LinkedList<Customer> customerList = new LinkedList<Customer>();
    private static final Scanner scanner = new Scanner(System.in);
    final static String[] stringSex = {"nam", "nữ", "khác"};
    final static String[] stringType = {"Diamond", "Platinium", "Gold", "Silver", "Member"};
    final static String REGEX_BIRTHDAY = "(^(((0[1-9]|1[0-9]|2[0-8])[\\/](0[1-9]|1[012]))|((29|30|31)[\\/](0[13578]|1[02]))|((29|30)[\\/](0[4,6,9]|11)))[\\/](19|[2-9][0-9])\\d\\d$)|(^29[\\/]02[\\/](19|[2-9][0-9])(00|04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)$)";
    final static String REGEX_EMAIL = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";


//    static {
//        Customer ctm1 = new Customer(1, "Hùng", "20/10/1973", "Nam", "2031", "hung123@gmail.com", "Gold", "Đà Nẵng");
//        Customer ctm2 = new Customer(2, "Thảo", "20/8/1980", "Nữ", "2033", "Thao@gmail.com", "Member", "Quảng Nam");
//        Customer ctm3 = new Customer(3, "Huy", "21/3/1981", "Nam", "20231", "huy123@gmail.com", "Silver", "Huế");
//        customerList.add(ctm1);
//        customerList.add(ctm2);
//        customerList.add(ctm3);
//    }

    @Override
    public void display() {
        customerList = (LinkedList<Customer>) ReadAndWrite.readFileCtm("D:\\Codegym\\module2\\src\\case_study\\furama_resort\\data\\customer.csv");
        System.out.println("Danh sách khách hàng : ");
        for (Customer ctm : customerList
        ) {
            System.out.println(ctm);
        }
    }

    private boolean checkSex(String input) {
        for (int i = 0; i < stringSex.length - 1; i++) {
            if (input.equals(stringSex[i])) {
                return true;
            }
        }
        return false;
    }

    private boolean checkType(String input) {
        for (int i = 0; i < stringType.length - 1; i++) {
            if (input.equals((stringType[i]))) {
                return true;
            }
        }
        return false;
    }

    private String inputEmail() {
        System.out.println("Nhập email:");
        return RegexData.regexStr(scanner.nextLine(), REGEX_EMAIL, "Email không đúng định dạng!, vui lòng nhập lại");
    }

    @Override
    public void addNew() {
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        System.out.println("vui lòng nhập đúng định dạng dd/mm/YYYY ");
        String age = RegexData.regexAge(scanner.nextLine(), REGEX_BIRTHDAY);
        System.out.println("Nhập giới tính (nam/nữ/khác): ");
        String sex = scanner.nextLine();
        while (!checkSex(sex)) {
            System.out.println("giới tính không hợp lệ vui lòng nhập lại");
            sex = scanner.nextLine();
        }
        System.out.println("Nhập Chứng minh: ");
        String idCard = scanner.nextLine();
        String email = inputEmail();
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
        ReadAndWrite.writeFileCtm(customerList, "D:\\Codegym\\module2\\src\\case_study\\furama_resort\\data\\customer.csv");
    }


    @Override
    public void edit() {
        System.out.println("Vui lòng nhập ID khách hàng bạn muốn sửa thông tin: ");
        Integer editId = Integer.parseInt(scanner.nextLine());
        for (Customer ctm : customerList
        ) {
            if (editId.equals(ctm.getId())) {
                boolean check = true;
                while (check) {
                    System.out.println("Vui lòng chọn thông tin bạn muốn sửa: ");
                    System.out.println("1. Tên ");
                    System.out.println("2. Tuổi ");
                    System.out.println("3. Giới Tính ");
                    System.out.println("4. CMND ");
                    System.out.println("5. Email");
                    System.out.println("6. Loại khách hàng ");
                    System.out.println("7. Địa chỉ ");
                    System.out.println("8. Quay lại ");
                    System.out.println();
                    int choice = 0;
                    try {
                        choice = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("you entered the wrong format, please type again from 1 to 8 :");
                    }
                    switch (choice) {
                        case 1:
                            System.out.println("Nhập tên mới: ");
                            String newName = scanner.nextLine();
                            ctm.setName(newName);
                            System.out.println("sửa thành công ");
                            System.out.println(ctm);
                            break;
                        case 2:
                            System.out.println("Nhập tuổi mới: ");
                            String newAge = RegexData.regexAge(scanner.nextLine(), REGEX_BIRTHDAY);
                            ctm.setAge(newAge);
                            System.out.println("sửa thành công ");
                            System.out.println(ctm);
                            break;
                        case 3:
                            System.out.println("Nhập giới tính: ");
                            String newSex = scanner.nextLine();
                            while (!checkSex(newSex)) {
                                System.out.println("giới tính không hợp lệ vui lòng nhập lại");
                                newSex = scanner.nextLine();
                            }
                            ctm.setSex(newSex);
                            System.out.println("sửa thành công ");
                            System.out.println(ctm);
                            break;
                        case 4:
                            System.out.println("Nhập Chứng minh mới: ");
                            String newIdCard = scanner.nextLine();
                            ctm.setIdCard(newIdCard);
                            System.out.println("sửa thành công ");
                            System.out.println(ctm);
                            break;
                        case 5:
                            String newEmail = inputEmail();
                            ctm.setEmail(newEmail);
                            System.out.println("sửa thành công ");
                            System.out.println(ctm);
                            break;
                        case 6:
                            System.out.println("Nhập loại khách hàng: ");
                            System.out.println("(Diamond, Platinium, Gold, Silver, Member)");
                            String newType = scanner.nextLine();
                            while (!checkType(newType)) {
                                System.out.println("loại khách hàng không hợp lệ vui lòng nhập lại");
                                newType = scanner.nextLine();
                            }
                            ctm.setType(newType);
                            System.out.println("sửa thành công ");
                            System.out.println(ctm);
                            break;
                        case 7:
                            System.out.println("Nhập địa chỉ mới: ");
                            String newAddress = scanner.nextLine();
                            ctm.setAddress(newAddress);
                            System.out.println("sửa thành công ");
                            System.out.println(ctm);
                            break;
                        case 8:
                            break;
                    }
                    if (choice == 8) {
                        check = false;
                    }
                }
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
                System.out.println("Bạn có muốn xóa khách hàng có mã ID là: " + checkId + " không?");
                System.out.println("1: Có.");
                System.out.println("2: Không.");
                int checkDel = scanner.nextInt();
                switch (checkDel) {
                    case 1:
                        customerList.remove(ctm);
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
            System.out.println("không tồn tại mã khách hàng cần xóa");
        }
    }


}
