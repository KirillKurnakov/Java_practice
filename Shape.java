package JavaPractice3;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    Shape (){
        color = "BLACK";
        filled = true;
    }

    Shape (String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    String getColor () {
        return color;
    }

    void SetColor (String color) {
        this.color = color;
    }

    boolean isFilled() {
        return filled;
    }

    void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract double getArea ();
    abstract double getPerimetr();
    public String toString(){
        return "d";
    }

}
