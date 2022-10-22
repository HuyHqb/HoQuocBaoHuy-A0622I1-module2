package case_study.furama_resort.services.impl;

import case_study.furama_resort.facilities.Facility;
import case_study.furama_resort.facilities.House;
import case_study.furama_resort.facilities.Room;
import case_study.furama_resort.facilities.Villa;
import case_study.furama_resort.services.FacilityService;

import java.util.*;

public class FacilityServiceIplm implements FacilityService {
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

    @Override
    public void addNewVilla() {
        System.out.println("Nhập id: ");
        String id = scanner.nextLine();
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập diện tích: ");
        double area = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập giá tiền: ");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số lượng người: ");
        int people = Integer.parseInt(scanner.nextLine());
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
        System.out.println("Nhập id: ");
        String id = scanner.nextLine();
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập diện tích: ");
        double area = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập giá tiền: ");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số lượng người: ");
        int people = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập kiểu thuê: ");
        String rentType = scanner.nextLine();
        System.out.println("Nhập số tầng: ");
        String freeService = scanner.nextLine();
        Room room = new Room(id, name, area, price, people, rentType, freeService);
        facilitiesList.put(room, 0);
        System.out.println("Đã thêm mới thành công!");
    }

    @Override
    public void addNewHouse() {
        System.out.println("Nhập id: ");
        String id = scanner.nextLine();
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập diện tích: ");
        double area = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập giá tiền: ");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số lượng người: ");
        int people = Integer.parseInt(scanner.nextLine());
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
