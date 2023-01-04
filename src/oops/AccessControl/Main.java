package oops.AccessControl;

public class Main {
    public static void main(String[] args) {
        A obj = new A (34, "Kunal");

        //need to do a few things
        // 1. access the data members
        // 2. modify the data members


        int n =obj.getNum();

        System.out.println(n);
    }
}
