package oops.polymorphism;

public class MainCalling {

    void sum (int a, int b) {
        System.out.println("Sum = " + (a + b));;
    }
    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();

        Shapes square1 = new Square(); // you can use parent class object variable with inherent class
        square.area();
        square1.area();

        MainCalling obj = new MainCalling();
        obj.sum(2,3);
    }

    // types of polymorphism --> i> Compile Time / Static Polymorphism -- achieved via method overloading
    //                                       same name but type, arguments, return types, ordering (of the type of arguments)
    //                                       can be different ex - Shape obj = new obj();   Shape obj1 = new obj(parameter);
    //                          ii> Run Time Polymorphism -- achieved via different reference variable with the different type
    //                                       of object ex-

}
