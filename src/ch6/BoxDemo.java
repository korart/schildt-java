package ch6;

public class BoxDemo {
    public static void main(String[] args) {
        Box box = new Box(10, 15, 20);


        double volume = box.width * box.height * box.depth;
        System.out.println("Box volume: " + volume);

        System.out.println("Box volume: " + box.getVolume());
    }
}
