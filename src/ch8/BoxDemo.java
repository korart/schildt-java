package ch8;

public class BoxDemo {
    public static void main(String[] args) {
        Shipment box1 = new Shipment();
        Shipment box2 = new Shipment(10.15, 20.02, 15.7, 0.076, 215);
        Shipment box3 = new Shipment(3.14, 4.5, 140);
        Shipment box4 = new Shipment(box3);

        printInfo(box1);
        printInfo(box2);
        printInfo(box3);
        printInfo(box4);
    }

    public static void printInfo(Shipment sh) {
        System.out.println("Volume of shipment: " + sh.getVolume());
        System.out.println("Weight of shipment: " + sh.getWeight());
        System.out.println("Cost of shipment: $" + sh.getCost());
        System.out.println("======================");
    }
}
