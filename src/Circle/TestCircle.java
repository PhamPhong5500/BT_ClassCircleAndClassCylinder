package Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle1 circle = new Circle1();
        System.out.println(circle);

        circle = new Circle1(6.5,"blue");
        System.out.println(circle);

        circle = new Circle1(5.5, "red");
        System.out.println(circle);
    }
}
