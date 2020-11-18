package ch8.Box;

public class BoxWeight extends Box {
    private double weight;

    public BoxWeight(double width, double height, double depth, double weight) {
        super(width, height, depth);
        this.weight = weight;
    }

    public BoxWeight(BoxWeight obj) {
        super(obj);
        this.weight = obj.weight;
    }

    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(double a, double weight) {
        super(a);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}
