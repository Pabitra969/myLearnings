package oops.polymorphism;

public class ObjectPrint {
    int num;
    public ObjectPrint(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "ObjectPrint{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(54);

        System.out.println(obj);  // in run time its deciding which method is to be run because here is the default
                                  // object of print method but in this particular code we also provide a print method to print
                                  // that's why the compiler decides in run time which method to call
                                  // this is the runtime polymorphism.
    }

    // final keyword is use to defend the override of the method
    // "final" -- we can't override the method of the in which the final keyword is used before it -- also known as late binding
}
