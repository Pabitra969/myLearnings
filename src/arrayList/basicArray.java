package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class basicArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(9);
        list.add(3);
        list.add(10);
        list.add(5);
        System.out.println(list.size());
        System.out.println(list.get(3));
        list.remove(2);
        System.out.println(list);
        list.set(2,8);
        System.out.println(list);

        System.out.println(list.contains(2));

        System.out.println(list.contains(70));

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
