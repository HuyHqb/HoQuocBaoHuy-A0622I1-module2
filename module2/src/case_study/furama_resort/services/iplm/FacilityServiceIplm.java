package case_study.furama_resort.services.iplm;

import case_study.furama_resort.facilities.Facility;
import case_study.furama_resort.facilities.House;
import case_study.furama_resort.facilities.Room;
import case_study.furama_resort.facilities.Villa;
import case_study.furama_resort.services.FacilityService;
import case_study.furama_resort.utils.ReadAndWrite;
import case_study.furama_resort.utils.RegexData;

import java.util.*;

public class FacilityServiceIplm implements FacilityService {

    public static final String REGEX_STR = "[A-Z][a-z]";
    public static final String REGEX_ID_VILLA = "(SVVL)[-][\\d]{4}";
    public static final String REGEX_ID_HOUSE = "(SVHO)[-][\\d]{4}";
    public static final String REGEX_ID_ROOM = "(SVRO)[-][\\d]{4}";
    public static final String REGEX_AMOUNT = "^[0-9]|([1][0-9])|[20]$";
    public static final String REGEX_INT = "^[1-9]|([1][0-9])$";
    public static final String REGEX_AREA = "^([3-9]\\d|[1-9]\\d{2,})$";


    private static final LinkedHashMap<Facility, Integer> facilitiesList = new LinkedHashMap<Facility, Integer>();
    private static final Scanner scanner = new Scanner(System.in);

    static {

    }

    @Override
    public void display() {
        Set<Facility> keys = facilitiesList.keySet();
        for (Facility key : keys) {
            System.out.println("Key: " + key + " | Value: " + facilitiesList.get(key));
        }
    }

    @Override
    public void displayMaintain() {
        for (Map.Entry<Facility, Integer> element : facilitiesList.entrySet()) {
            System.out.println("Service " + element.getKey() + " số lần đã thuê: " + element.getValue());
        }
    }


    private String inputIdVl() {
        System.out.println("Nhập ID, mã dịch vụ: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_ID_VILLA, "Không đúng định dạng, vui lòng nhập đúng định dạng là : SVVL-xxxx");
    }

    private String inputIdRo() {
        System.out.println("Nhập ID, mã dịch vụ: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_ID_ROOM, "Không đúng định dạng, vui lòng nhập đúng định dạng là : SVVL-xxxx");
    }

    private String inputIdHo() {
        System.out.println("Nhập ID, mã dịch vụ: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_ID_HOUSE, "Không đúng định dạng, vui lòng nhập đúng định dạng là : SVVL-xxxx");
    }

    private String inputName() {
        System.out.println("Nhập tên dịch vụ: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_STR, "Không đúng định dạng, tên dịch vụ phải viết hoa chữ cái đầu. ");
    }

    private String inputArea() {
        System.out.println("Nhập diện tích: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_AREA, "Không đúng định dạng, diện tích phải lớn hơn 30.");
    }

    private String inputTotalPay() {
        System.out.println("Nhập giá tiền: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_INT, "Không đúng định dạng, giá tiền phải là số dương.");
    }

    private String inputPeople() {
        System.out.println("Nhập số người: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_INT, "Không đúng định dạng, giá tiền phải lớn hơn 0 và nhỏ hơn 20.");
    }


    @Override
    public void addNewVilla() {
        String id = inputIdVl();
        String name = inputName();
        double area = Double.parseDouble(inputArea());
        int price = Integer.parseInt(inputTotalPay());
        int people = Integer.parseInt(inputPeople());
        System.out.println("Nhập kiểu thuê: ");
        String rentType = scanner.nextLine();
        System.out.println("Nhập tiêu chuẩn: ");
        String standard = scanner.nextLine();
        System.out.println("Nhập diện tích hồ bơi: ");
        double areaPool = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số tầng: ");
        int floor = Integer.parseInt(scanner.nextLine());
        Villa villa = new Villa(id, name, area, price, people, rentType, standard, areaPool, floor);
        facilitiesList.put(villa, 0);
        System.out.println("Đã thêm mới thành công!");
    }


    @Override
    public void addNewRoom() {

        String id = inputIdRo();

        String name = inputName();
        double area = Double.parseDouble(inputArea());
        int price = Integer.parseInt(inputTotalPay());
        int people = Integer.parseInt(inputPeople());
        System.out.println("Nhập kiểu thuê: ");
        String rentType = scanner.nextLine();
        System.out.println("Nhập số tầng: ");
        String freeService = scanner.nextLine();
        Room room = new Room(id, name, area, price, people, rentType, freeService);
        facilitiesList.put(room, 0);
        System.out.println("Đã thêm mới thành công!");
        ReadAndWrite.writeFileRoom((List<Room>) facilitiesList, "D:\\Codegym\\module2\\src\\case_study\\furama_resort\\data\\facilities.csv");
    }

    @Override
    public void addNewHouse() {
        String id = inputIdHo();
        String name = inputName();
        double area = Double.parseDouble(inputArea());
        int price = Integer.parseInt(inputTotalPay());
        int people = Integer.parseInt(inputPeople());
        System.out.println("Nhập kiểu thuê: ");
        String rentType = scanner.nextLine();
        System.out.println("Nhập tiêu chuẩn: ");
        String standard = scanner.nextLine();
        System.out.println("Nhập số tầng: ");
        int floor = Integer.parseInt(scanner.nextLine());
        House house = new House(id, name, area, price, people, rentType, standard, floor);
        facilitiesList.put(house, 0);
        System.out.println("Đã thêm mới thành công!");
    }

    public void delete() {

    }


}
