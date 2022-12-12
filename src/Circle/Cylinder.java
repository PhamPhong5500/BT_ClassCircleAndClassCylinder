package Circle;

public class Cylinder extends Circle1 {
    public double height;
    public String color ;

    public  Cylinder() {
    }
    public Cylinder(double height, String color){
        this.height=height;
        this.color = color;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(){
        this.height=height;
    }
    public String getColor() {
        return color;
    }
    public  void  setColor(){
        this.color=color;
    }
    public double getArea() {
        return Math.PI * (this.radius * this.radius) * height;
    }
    @Override
    public String toString() {
        return "Hình trụ có chiều cao là: "
                + getHeight()
                +", có màu là : "
                +getColor()
                +"Đó là một lớp con của "
                +super.toString();
    }
}
