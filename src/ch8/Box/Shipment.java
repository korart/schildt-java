package ch8.Box;

public class Shipment extends BoxWeight {
    private double cost;

    public Shipment(double width, double height, double depth, double weight, double cost) {
        super(width, height, depth, weight);
        this.cost = cost;
    }

    public Shipment(Shipment obj) {
        super(obj);
        this.cost = obj.cost;
    }

    public Shipment() {
        super();
        this.cost = -1;
    }

    public Shipment(double a, double weight, double cost) {
        super(a, weight);
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}
