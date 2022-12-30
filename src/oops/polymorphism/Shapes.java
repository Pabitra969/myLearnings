package oops.polymorphism;

public class Shapes { // "public final class Shapes {
                             // code
                                // this code can't be used in child class
                      //  }
    /*final*/ void area () {  // here as we used the final keyword the override (in inheritance class) is denied shows error
        System.out.println("I am in Shapes");
    }
}
