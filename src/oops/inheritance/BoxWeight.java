package oops.inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(double weight) {
        this.weight = weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); // use to call the parents class constructor --- super always used before the inherent class objects
        // use to initialise values present in parent
        this.weight = weight;
    }

    public BoxWeight(BoxWeight other) {
        this.weight = other.weight;
    }

    // multiple inheritance is not allowed in java hierarchical inheritance is allowed in java

    static void greeting () {  // static does not
        System.out.println("Hey, I am in the BoxWeight class.greetings!");
    }

}
