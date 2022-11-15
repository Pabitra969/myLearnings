package arrayList;

import oops.BoxWeight;

public class BoxColour extends BoxWeight {
    String colour;

    public BoxColour(){
        this.colour = "blue";
    }

    public BoxColour (String colour, double weight) {
        super(weight);
        this.colour = colour;
    }
}
