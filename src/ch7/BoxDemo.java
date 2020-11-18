package ch7;

public class BoxDemo {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(10.15, 20.02, 15.7);
        Box box3 = new Box(3.14);

        System.out.println(box1.getVolume());
        System.out.println(box2.getVolume());
        System.out.println(box3.getVolume());
    }
}
