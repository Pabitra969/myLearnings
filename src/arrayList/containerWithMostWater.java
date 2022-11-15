package arrayList;

import java.util.ArrayList;

public class containerWithMostWater {
    public static void main(String[] args) {
        ArrayList<Integer> container = new ArrayList<>();
        container.add(1);
        container.add(8);
        container.add(6);
        container.add(2);
        container.add(5);
        container.add(4);
        container.add(8);
        container.add(3);
        container.add(7);

        System.out.println(calculateArea(container));
    }


    public static int calculateArea(ArrayList<Integer> container) {
        int lp = 0;
        int rp = container.size() - 1;
        int area = Integer.MIN_VALUE;
        while (lp < rp) {
            int height = Math.min(container.get(lp), container.get(rp));
            int width = rp - lp;
            int localArea = height * width;

            area = Math.max(area, localArea);
//            if (localArea > area) {
//                area = localArea;
//            }

            if (container.get(lp) > container.get(rp)) {
                rp--;
            } else {
                lp++;
            }
        }
        return area;
    }


}