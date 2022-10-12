package case_study.controllers;

import case_study.models.Employee;
import case_study.models.Person;
import case_study.services.impl.EmployeeServiceIplm;

import java.util.Scanner;

public class FuramaController {

    public static void main(String[] args) {
        displayMainMenu();
    }


    public static void displayMainMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            Scanner sc = new Scanner(System.in);
            switch (sc.nextInt()) {
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
            System.out.println("4. Return main menu");
            Scanner sc = new Scanner(System.in);
            switch (sc.nextInt()) {
                case 1:
                    employeeServiceIplm.display();
                    break;
                case 2:
                    employeeServiceIplm.addNew();
                    break;
                case 3:
                    employeeServiceIplm.edit();
            }
        }
    }

    public static void displayCustomerMenu() {
        EmployeeServiceIplm employeeService = new EmployeeServiceIplm();
        boolean check = true;
        while (check) {
            System.out.println("1. Display list customer");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Return main menu");
            Scanner sc = new Scanner(System.in);
            switch (sc.nextInt()) {
                case 1:
                    employeeService.display();
                case 2:
                    employeeService.addNew();
            }
        }
    }

    public static void displayFacilityMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Return main menu");
            Scanner sc = new Scanner(System.in);
            switch (sc.nextInt()) {
                case 1:
            }
        }
    }

    public static void displayBookingMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Add new booking");
            System.out.println("2. Display list booking");
            System.out.println("3. Create new contracts");
            System.out.println("3. Display list contracts");
            System.out.println("3. Edit contracts");
            System.out.println("4. Return main menu");
            Scanner sc = new Scanner(System.in);
            switch (sc.nextInt()) {
                case 1:
            }
        }
    }

    public static void displayPromotionMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Display customer use service");
            System.out.println("2. Display list customer get voucher");
            System.out.println("4. Return main menu");
            Scanner sc = new Scanner(System.in);
            switch (sc.nextInt()) {
                case 1:
            }
        }
    }
}
