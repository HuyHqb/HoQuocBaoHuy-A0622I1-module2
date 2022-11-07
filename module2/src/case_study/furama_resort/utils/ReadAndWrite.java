package case_study.furama_resort.utils;

import case_study.furama_resort.facilities.Facility;
import case_study.furama_resort.facilities.Room;
import case_study.furama_resort.models.Customer;
import case_study.furama_resort.models.Employee;
import codegym.vn.textfile.Student;

import java.io.*;
import java.util.*;

public class ReadAndWrite {


    //Read and write employee
    public static void writeFileEmp(List<Employee> employeeList, String filename) {
        try (BufferedWriter buffered = new BufferedWriter(new FileWriter(filename, false))) {
            for (Employee employee : employeeList) {
                buffered.write(employee.getInfo());
                buffered.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Employee> readFileEmp(String filename) {
        List<Employee> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                if (line.trim().equals("")) {
                    continue;
                }
                list.add(new Employee(line));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }


    //Read and write customer
    public static void writeFileCtm(List<Customer> customerList, String filename) {
        try (BufferedWriter buffered = new BufferedWriter(new FileWriter(filename, false))) {
            for (Customer customer : customerList) {
                buffered.write(customer.getInfo());
                buffered.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Customer> readFileCtm(String filename) {
        List<Customer> list = new LinkedList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                if (line.trim().equals("")) {
                    continue;
                }
                list.add(new Customer(line));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    //Read and write Room
    public static void writeFileRoom(List<Room> roomList, String filename) {
        try (BufferedWriter buffered = new BufferedWriter(new FileWriter(filename, false))) {
            for (Room room : roomList) {
                buffered.write(room.getInfo());
                buffered.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static List<Room> readFileRoom(String filename) {
        List<Room> list = (List<Room>) new LinkedHashMap<Room, Integer>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                if (line.trim().equals("")) {
                    continue;
                }
                list.add(new Room(line) {
                });
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
