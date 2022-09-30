package ss9_dsa_danh_sach.bai_tap.trien_khai_phuong_thuc_linked_list;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes;

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    public MyLinkedList() {

    }


    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(E e) {
        if (head == null) {
            head = new Node(e);
        } else {
            Node p = new Node(e);
            p.next = head;
            head = p;
        }
        numNodes++;
    }

    public void addLast(E e) {
        if (head == null) {
            addFirst(e);
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(e);
            numNodes++;
        }

    }


    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void remove(int index) {
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        numNodes--;
    }

    public boolean remove(E e) {
        if (contains(e)) {
            remove(indexOf(e));
            return true;
        }

        return false;
    }

    public int size() {
        return numNodes;
    }

    public Object clone() {
        MyLinkedList<E> clone = new MyLinkedList<>();
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            clone.addLast((E) temp.getData());
            temp = temp.next;
        }
        return clone;
    }

    public boolean contains(E o) {
        Node temp = head;
        while (temp.next != null) {
            if (temp.getData() == o)
                return true;
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(E o) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.getData() == o)
                return i;
            temp = temp.next;
        }
        return -1;
    }

    public boolean add(E e) {
        addLast(e);
        return true;
    }

    public E get(int i) {
        if (i >= numNodes)
            throw new IndexOutOfBoundsException();
        else if (i == 0) {
            return getFirst();
        } else if (i == numNodes - 1) {
            return getLast();
        } else {
            Node temp = head;
            for (int j = 0; j < i; j++) {
                temp = temp.next;
            }
            return (E) temp.getData();
        }
    }

    public E getFirst() {
        return (E) head.getData();
    }

    public E getLast() {
        Node temp = head;
        for (int i = 0; i < numNodes - 1; i++) {
            temp = temp.next;
        }
        return (E) temp.getData();
    }

    public void clear() {
        head = null;
        numNodes = 0;
    }


}
