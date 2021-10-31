package JavaPractice3;

public class MovablePoint implements Movable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int x,int y,int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    @Override
    public void moveUp() {
        y +=Math.abs(ySpeed);
    }

    @Override
    public void moveDown() {
        y -=Math.abs(ySpeed);
    }

    @Override
    public void moveLeft() {
        x -=Math.abs(xSpeed);
    }

    @Override
    public void moveRight() {
        x +=Math.abs(xSpeed);
    }

}