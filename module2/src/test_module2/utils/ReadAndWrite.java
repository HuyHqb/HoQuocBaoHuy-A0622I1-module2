package test_module2.utils;

import case_study.furama_resort.facilities.Room;
import case_study.furama_resort.models.Employee;
import test_module2.user.Account;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class ReadAndWrite {
    public static void writeFileAccount(List<Account> accountList, String filename) {
        try (BufferedWriter buffered = new BufferedWriter(new FileWriter(filename, false))) {
            for (Account account : accountList) {
                buffered.write(account.getInfo());
                buffered.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Account> readFileAccount(String filename) {
        List<Account> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                if (line.trim().equals("")) {
                    continue;
                }
                list.add(new Account(line));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
