package JavaPractice3;

public class Square extends Rectangle {
    Square() {}

    Square(double side) {
        this.width = side;
        this.length = side;
        this.color = "BLACK";
        this.filled = false;
    }

    Square(double side,String color,boolean filled) {
        this.width = side;
        this.length = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setWidth(double side) {
        this.width = side;
    }

    @Override
    public void setLength(double side) {
        this.length = side;
    }

    @Override
    public String toString() {
        return "Shape: square, side: "+this.width+", color: " + this.color;
    }
}
