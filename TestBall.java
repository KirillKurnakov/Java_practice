import java.lang.*;
public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(2.3,5.4);
        System.out.println(b1);
        b1.move(2.1,3.2);
        System.out.println(b1);
        Ball b2 = new Ball();
        b2.setX(1.2);
        b2.setY(1.7);
        System.out.println(b2);

    }
}