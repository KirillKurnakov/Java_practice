//import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.ArrayDeque;
public class Main {

    public boolean check (int A,int B) {
        if (A == 0 && B == 9) {
            return true;
        }
        if (A == 9 && B == 0) {
            return false;
        }
        if (A > B) {
            return true;
        }
        if (A < B) {
            return false;
        }
        return true;
    }

    public void work (int[] A,int[] B) {
        ArrayDeque<Integer> A1 = new ArrayDeque<Integer>();
        ArrayDeque<Integer> B1 = new ArrayDeque<Integer>();
        for (int i = 0; i < A.length; i++) { // записываем массив а в первую очередь
            A1.add(A[i]);
        }
        for (int i = 0; i < B.length; i++) { // во вторую
            B1.add(B[i]);
        }
        int ch = 0;
        for (int i=0; i < 106; i++) {
            if(check(A1.peekFirst(),B1.peekFirst()) == true) {
                A1.addLast(A1.pollFirst());
                A1.addLast(B1.pollFirst());
                if (B1.peekFirst() == null) {
                    System.out.println("first " + (i + 1));
                    System.exit(0);
                }
            }
            else {
                    B1.add(A1.pollFirst());
                    B1.add(B1.pollFirst());
                    if (A1.peekFirst() == null) {
                        System.out.println("second " + (i + 1));
                        System.exit(0);
                    }
            }
            ch = i+1;
        }
        if (ch == 106) {
            System.out.println("botva");
        }
    }

    public static void main(String[] args) {
	    int[] A = {1,3,5,7,9};
        int[] B = {2,4,6,8,0};
        Main obj = new Main();
        obj.work(A,B);
    }
}
