package A_final_test_module2.utils;

import A_final_test_module2.user.Account;
import A_final_test_module2.user.AccountLessor;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static void writeFileAccountLessor(List<Account> accountLessorList, String filename) {
        try (BufferedWriter buffered = new BufferedWriter(new FileWriter(filename, false))) {
            for (Account accountLessor : accountLessorList) {
                buffered.write(accountLessor.getInfo());
                buffered.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Account> readFileAccountLessor(String filename) {
        List<Account> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                if (line.trim().equals("")) {
                    continue;
                }
                list.add(new AccountLessor(line));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
