import java.util.Scanner;
// Задание 11 ( количество единиц, именно чисел 1)
public class NumberOfUnits extends Main{
    public int NOU () {
        Scanner in = new Scanner(System.in);
        int i = 0;
        int hg = in.nextInt();
        if (hg == 00)
            return 0;
        i = NOU();
        if (hg == 1)
            return i+1;
        return i;
    }
}
