package JavaPractice3;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    Rectangle() {
        this.filled = true;
        this.color = "yellow";
        width = 1;
        length = 2;
    }

    Rectangle(double width,double length){
        this.filled = true;
        this.color = "yellow";
        this.width = width;
        this.length = length;
    }

    Rectangle(double width,double length,String color,boolean filled) {
        this.filled = filled;
        this.color = color;
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea(){
        return width*length;
    }

    @Override
    public double getPerimetr() {
        return 2*(width + length);
    }

    @Override
    public String toString() {
        return "Shape: rectangle, width: "+this.width+", length: "+this.length+ "color: " + this.color;
    }
}
