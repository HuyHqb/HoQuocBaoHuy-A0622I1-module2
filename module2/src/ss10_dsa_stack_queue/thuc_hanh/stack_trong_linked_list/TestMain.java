package ss10_dsa_stack_queue.thuc_hanh.stack_trong_linked_list;

import static ss10_dsa_stack_queue.thuc_hanh.stack_trong_linked_list.GenericStackClient.stackOfIStrings;
import static ss10_dsa_stack_queue.thuc_hanh.stack_trong_linked_list.GenericStackClient.stackOfIntegers;

public class TestMain {
    public static class GenericStackClient {
        public static void main(String[] args) {
            System.out.println("1. Stack of integers");
            stackOfIntegers();
            System.out.println("\n2. Stack of Strings");
            stackOfIStrings();
        }
    }
}
