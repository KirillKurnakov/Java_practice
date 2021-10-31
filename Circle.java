package JavaPractice3;
import java.math.*;
public class Circle extends Shape {
    protected double radius;

    Circle(){
        this.filled = false;
        this.color = "red";
        radius = 1;
    }

    Circle(double radius){
        this.filled = false;
        this.color = "red";
        this.radius = radius;
    }

    Circle(double radius,String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
         this.radius = radius;
    }

    @Override
    public double getArea () {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimetr() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Shape: circle, radius: "+this.radius+", color: " + this.color;
    }
}
