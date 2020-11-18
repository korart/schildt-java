package ch8;

public class BoxDemo {
    public static void main(String[] args) {
        BoxWeight box1 = new BoxWeight();
        BoxWeight box2 = new BoxWeight(10.15, 20.02, 15.7, 0.076);
        BoxWeight box3 = new BoxWeight(3.14, 4.5);

        System.out.println(box1.getWeight());
        System.out.println(box2.getWeight());
        System.out.println(box3.getWeight());
    }
}
