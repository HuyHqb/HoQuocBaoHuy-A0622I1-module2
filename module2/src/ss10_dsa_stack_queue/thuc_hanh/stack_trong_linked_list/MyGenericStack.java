package ss10_dsa_stack_queue.thuc_hanh.stack_trong_linked_list;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private final LinkedList<T> stack;

    public MyGenericStack() {
        stack = new LinkedList();
    }

    public void push(T element) {
        stack.add(element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        return stack.size() == 0;
    }
}
