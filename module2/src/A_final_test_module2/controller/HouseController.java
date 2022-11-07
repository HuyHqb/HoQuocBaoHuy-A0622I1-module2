package A_final_test_module2.controller;

import A_final_test_module2.service.LessorService;
import A_final_test_module2.service.RenterService;

import java.util.Scanner;

public class HouseController {
    public static void main(String[] args) {
        displayMainMenu();
    }


    public static void displayMainMenu() {
        LessorService lessorService = new LessorService();
        RenterService renterService = new RenterService();
        boolean check = true;

        while (check) {
            System.out.println("------HOUSE MANAGEMENT SYSTEM------");
            System.out.println("1. Register ");
            System.out.println("2. Show information");
            System.out.println("3. Search ");
            System.out.println("4. delete and display: ");
            System.out.println("5. save account information in file.");
            System.out.println("6. Import information from file to program ");
            System.out.println("7. exit ");
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
                    displayRegisterMenu();
                    break;
                case 2:
                    displayMenuDisplay();
                    break;
                case 3:

                    break;
                case 4:
                    displayMenuDelete();
                    break;
                case 5:
                    displayMenuSaveToFile();

                    break;
                case 6:
                    displayMenuReadFromFile();
                    break;
                case 7:
                    System.out.println("Cảm ơn bạn đã sử dụng hệ thống!");
                    check = false;
                    break;
            }
        }
    }

    public static void displayMenuDisplay() {
        LessorService lessorService = new LessorService();
        RenterService renterService = new RenterService();
        boolean check = true;
        while (check) {
            System.out.println("------Delete account menu------");
            System.out.println("1. display list account renter ");
            System.out.println("2. display list account lessor ");
            System.out.println("3. display all account ");
            System.out.println("4. Back to main menu");
            Scanner sc = new Scanner(System.in);
            int choice = 0;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("you entered the wrong format, please type again from 1 to 3 :");
            }
            switch (choice) {
                case 1:
                    renterService.displayRenterList();
                    break;
                case 2:
                    lessorService.displayLessorList();
                    break;
                case 3:
                    System.out.println("Renter account: ");
                    renterService.displayRenterList();
                    System.out.println("-----------------------------");
                    System.out.println("Lessor account: ");
                    lessorService.displayLessorList();
                    break;
                case 4:
                    check = false;
                    break;
            }
        }
    }


    public static void displayMenuDelete() {
        LessorService lessorService = new LessorService();
        RenterService renterService = new RenterService();
        boolean check = true;
        while (check) {
            System.out.println("------Delete account menu------");
            System.out.println("1. delete account renter ");
            System.out.println("2. delete account lessor ");
            System.out.println("3. Back to main menu");
            Scanner sc = new Scanner(System.in);
            int choice = 0;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("you entered the wrong format, please type again from 1 to 3 :");
            }
            switch (choice) {
                case 1:
                    renterService.deleteRenterAccount();
                    System.out.println("Xóa thành công!");
                    break;
                case 2:
                    lessorService.deleteLessorAccount();
                    System.out.println("Xóa thành công!");
                    break;
                case 3:
                    check = false;
                    break;
            }
        }
    }

    public static void displayRegisterMenu() {
        LessorService lessorService = new LessorService();
        RenterService renterService = new RenterService();
        boolean check = true;
        while (check) {
            System.out.println("------Register menu------");
            System.out.println("1. add new account renter ");
            System.out.println("2. add new account lessor ");
            System.out.println("3. Back to main menu");
            Scanner sc = new Scanner(System.in);
            int choice = 0;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("you entered the wrong format, please type again from 1 to 3 :");
            }
            switch (choice) {
                case 1:
                    renterService.addNewRenter();
                    System.out.println("Thêm mới người thuê thành công!");
                    break;
                case 2:
                    lessorService.addNewLessor();
                    System.out.println("thêm mới người cho thuê thành công!");
                    break;
                case 3:
                    check = false;
                    break;
            }
        }
    }

    public static void displayMenuSaveToFile() {
        LessorService lessorService = new LessorService();
        RenterService renterService = new RenterService();
        boolean check = true;
        while (check) {
            System.out.println("------Register menu------");
            System.out.println("1. Save account renter ");
            System.out.println("2. Save account lessor ");
            System.out.println("3. Back to main menu");
            Scanner sc = new Scanner(System.in);
            int choice = 0;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("you entered the wrong format, please type again from 1 to 3 :");
            }
            switch (choice) {
                case 1:
                    renterService.addRenterToFile();
                    System.out.println("ghi thành công!");
                    break;
                case 2:
                    lessorService.addLessorToFile();
                    System.out.println("ghi thành công!");
                    break;
                case 3:
                    check = false;
                    break;
            }
        }
    }

    public static void displayMenuReadFromFile() {
        LessorService lessorService = new LessorService();
        RenterService renterService = new RenterService();
        boolean check = true;
        while (check) {
            System.out.println("------Read Account menu------");
            System.out.println("1. Read account renter ");
            System.out.println("2. Read account lessor ");
            System.out.println("3. Back to main menu");
            Scanner sc = new Scanner(System.in);
            int choice = 0;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("you entered the wrong format, please type again from 1 to 3 :");
            }
            switch (choice) {
                case 1:
                    renterService.readRenterFrmFile();
                    System.out.println("Đọc thành công!");
                    break;
                case 2:
                    lessorService.readLessorFromFile();
                    System.out.println("Đọc thành công!");
                    break;
                case 3:
                    check = false;
                    break;
            }
        }
    }

}

