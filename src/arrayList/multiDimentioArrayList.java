package arrayList;

import java.util.ArrayList;

public class multiDimentioArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> list =  new ArrayList<>();
        list.add(1); list.add(2);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3); list2.add(4);

        mainlist.add(list);
        mainlist.add(list2);

        System.out.println(mainlist);

        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();
        ArrayList<Integer> list5 = new ArrayList<>();


        for (int i = 1; i <= 10; i++) {
            list3.add(i*2);
            list4.add(i*3);
            list5.add(i*4);
        }

        mainlist.add(list3);
        mainlist.add(list4);
        mainlist.add(list5);

        System.out.println(mainlist);
    }

}



