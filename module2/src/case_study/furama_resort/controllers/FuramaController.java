package case_study.furama_resort.controllers;

import case_study.furama_resort.services.impl.CustomerServiceIplm;
import case_study.furama_resort.services.impl.EmployeeServiceIplm;
import case_study.furama_resort.services.impl.FacilityServiceIplm;

import java.util.Scanner;

public class FuramaController {

    public static void main(String[] args) {
        displayMainMenu();
    }


    public static void displayMainMenu() {
        boolean check = true;

        while (check) {
            System.out.println("------FURAMA MANAGEMENT SYSTEM------");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");
            Scanner sc = new Scanner(System.in);
            int choice = 0;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("you entered the wrong format, please type again from 1 to 6 :");
            }
            switch (choice) {
                case 1:
                    displayEmployeeMenu();
                    break;
                case 2:
                    displayCustomerMenu();
                    break;
                case 3:
                    displayFacilityMenu();
                    break;
                case 4:
                    displayBookingMenu();
                    break;
                case 5:
                    displayPromotionMenu();
                    break;
                case 6:
                    break;
            }
        }
    }


    public static void displayEmployeeMenu() {
        EmployeeServiceIplm employeeServiceIplm = new EmployeeServiceIplm();
        boolean check = true;
        while (check) {
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employees");
            System.out.println("3. Edit employees");
            System.out.println("4. Delete employee");
            System.out.println("5. Return main menu");
            Scanner sc = new Scanner(System.in);
            int choice = 0;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("you entered the wrong format, please type again from 1 to 4 :");
            }
            switch (choice) {
                case 1:
                    employeeServiceIplm.display();
                    break;
                case 2:
                    employeeServiceIplm.addNew();
                    break;
                case 3:
                    employeeServiceIplm.edit();
                    break;
                case 4:
                    employeeServiceIplm.delete();
                    break;
            }
        }
    }

    public static void displayCustomerMenu() {
        CustomerServiceIplm customerServiceIplm = new CustomerServiceIplm();
        boolean check = true;
        while (check) {
            System.out.println("1. Display list customer");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. delete customer");
            System.out.println("5. Return main menu");
            Scanner sc = new Scanner(System.in);
            int choice = 0;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("you entered the wrong format, please type again from 1 to 5 :");
            }
            switch (choice) {
                case 1:
                    customerServiceIplm.display();
                    break;
                case 2:
                    customerServiceIplm.addNew();
                    break;
                case 3:
                    customerServiceIplm.edit();
                    break;
                case 4:
                    customerServiceIplm.delete();
                    break;
                case 5:
            }
        }
    }

    public static void displayFacilityMenu() {
        boolean check = true;
        FacilityServiceIplm facilityServiceIplm = new FacilityServiceIplm();

        while (check) {
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Return main menu");
            Scanner sc = new Scanner(System.in);
            int choice = 0;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("you entered the wrong format, please type again from 1 to 4 :");
            }
            switch (choice) {
                case 1: {
                    facilityServiceIplm.display();
                    break;
                }
                case 2: {
                    addNewFacilityMenu();
                    break;
                }
                case 3: {

                }
            }
        }
    }


    public static void addNewFacilityMenu() {
        boolean check = true;
        FacilityServiceIplm facilityServiceIplm = new FacilityServiceIplm();

        while (check) {
            System.out.println("1. add new villa");
            System.out.println("2. Add new house");
            System.out.println("3. Add new room");
            System.out.println("4. Return main menu");
            Scanner sc = new Scanner(System.in);
            int choice = 0;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("you entered the wrong format, please type again from 1 to 4 :");
            }
            switch (choice) {
                case 1:
                    facilityServiceIplm.addNewVilla();
                    break;
                case 2:
                    facilityServiceIplm.addNewHouse();
                    break;
                case 3:
                    facilityServiceIplm.addNewRoom();
                    break;
                case 4:
                    break;
            }
        }
    }

    public static void displayBookingMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Add new booking");
            System.out.println("2. Display list booking");
            System.out.println("3. Create new contracts");
            System.out.println("4. Display list contracts");
            System.out.println("5. Edit contracts");
            System.out.println("6. Return main menu");
            Scanner sc = new Scanner(System.in);
            int choice = 0;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("you entered the wrong format, please type again from 1 to 6 :");
            }
            switch (choice) {
                case 1:
            }
        }
    }

    public static void displayPromotionMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Display customer use service");
            System.out.println("2. Display list customer get voucher");
            System.out.println("3. Return main menu");
            Scanner sc = new Scanner(System.in);
            int choice = 0;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("you entered the wrong format, please type again from 1 to 3 :");
            }
            switch (choice) {
                case 1:
            }
        }
    }
}
