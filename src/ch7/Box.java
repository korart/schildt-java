package ch7;

public class Box {
    private double width;
    private double height;
    private double depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public Box() {
        this.width = -1;
        this.height = -1;
        this.depth = -1;
    }

    public Box(double a) {
        this.width = this.height = this.depth = a;
    }

    public double getVolume() {
        return width * height * depth;
    }
}
