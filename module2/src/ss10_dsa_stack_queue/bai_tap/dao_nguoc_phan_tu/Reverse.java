package ss10_dsa_stack_queue.bai_tap.dao_nguoc_phan_tu;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        Stack wStack = new Stack<>();
        Stack mStack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();

        for (int i = 0; i < inp.length(); i++) {
            wStack.push(inp.charAt(i));
        }
        System.out.println("mảng trước khi đảo : ");
        System.out.print(wStack);

        System.out.println("\nmảng sau khi đảo : ");
        while (!wStack.isEmpty()) {
            mStack.push(wStack.pop());
        }

        System.out.println(mStack);


    }


}

