package oops.polymorphism;

public class Circle extends Shapes {
    @Override
    public void area() {
        System.out.println("Area is 0.5 * h * b");
    }
}
