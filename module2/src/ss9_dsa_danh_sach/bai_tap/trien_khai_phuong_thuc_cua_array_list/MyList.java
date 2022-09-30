package ss9_dsa_danh_sach.bai_tap.trien_khai_phuong_thuc_cua_array_list;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }


    public E remove(int index) {
        if (index > 0 || index < size) {
            for (int i = index; i < size; i++) {
                elements[i] = elements[i + 1];
            }
            --size;
        }
        return (E) elements;
    }

    public E clone() {
        return (E) elements;
    }

    public boolean contains(E o) {
        for (int i = 0; i < elements.length; i++) {
            if (o == elements[i]) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == o) {
                return i;
            }
        }
        return -1;
    }

    public int size() {
        return size;
    }

    public void clear() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public void display() {
        for (Object x : elements) {
            if (x != null)
                System.out.print(x + "  ");
        }
    }
}
