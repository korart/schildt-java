package ch8.Figure;

public class FindAreas {

    public static void main(String[] args) {
        Figure rectangle = new Rectangle(9, 5);
        Figure triangle = new Triangle(10, 8);

        System.out.println("Rectangle area: " + rectangle.area());
        System.out.println("Triangle area: " + triangle.area());
    }
}
