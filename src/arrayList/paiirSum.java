package arrayList;

import java.util.ArrayList;

public class paiirSum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 12;
        System.out.println(calPairSum(list, target));
    }

    public static boolean calPairSum (ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size() - 1;
        while (lp < rp) {
            // check if sum = target
            if (list.get(lp)  + list.get(rp) == target) {
                return true;
            }
            // go for next number
            else if (list.get(lp)  + list.get(rp) > target) {
                rp--;
            } else if (list.get(lp)  + list.get(rp) < target) {
                lp++;
            }
        }
        return false;
    }
}
