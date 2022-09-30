package ss9_dsa_danh_sach.bai_tap.trien_khai_phuong_thuc_cua_array_list;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(4);

        System.out.println("element 3: " + listInteger.get(3));
        System.out.println("element 1: " + listInteger.get(1));
        System.out.println("element 2: " + listInteger.get(2));
        listInteger.remove(2);
        listInteger.contains(3);

        listInteger.display();
    }
}
