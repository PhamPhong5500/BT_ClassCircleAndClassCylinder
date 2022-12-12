package Circle;

public class Circle1 {
    public double radius;
    public String color;

    public Circle1() {
    }

    public Circle1(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius() {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(){
        this.color = color;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
    @Override
    public String toString() {
        return "Một đường tròn có bán kính là: "
                + getRadius()
                +", có màu là : "
                +getColor()
                + ", diện tích của hình tròn là "
                +getArea()
                + ", đó là một lớp con của : "
                + super.toString();
    }
}

