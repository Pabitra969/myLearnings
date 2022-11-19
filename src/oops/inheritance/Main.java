package oops.inheritance;

import arrayList.BoxColour;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(3);
        Box box2= new Box(box1);
//        System.out.println(box1.l + " " + box1.w + " " + box1.h);

        // calling parent class through inheritance class
        BoxWeight box3 = new BoxWeight(5);
        BoxWeight box4 = new BoxWeight(2, 3, 4, 8);
        System.out.println(box3.h + "   " + box3.weight);


        // calling the parent class properties in inheritance class
        BoxWeight box5 = new BoxWeight(4, 5, 6, 7);

        // referencing child class via parent class but opposite is not possible
        Box box6 = new BoxWeight(2, 3, 4, 8);
//        System.out.println(box4.h + "  " + box4.l + "  " + box4.w + "  " + box4.weight);

        BoxColour box7 = new BoxColour();
        BoxColour box8 = new BoxColour("green", 3);
    }
}
