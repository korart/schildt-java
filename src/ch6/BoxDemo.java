package ch6;

public class BoxDemo {
    public static void main(String[] args) {
        Box box = new Box();
        box.width = 10;
        box.height = 15;
        box.depth = 20;

        double volume = box.width * box.height * box.depth;
        System.out.println("Box volume: " + volume);
    }
}
