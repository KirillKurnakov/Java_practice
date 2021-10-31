import java.util.Scanner;
// 12 задание (вывод нечетных чисел )
public class OddOutput extends Main {
    public void Odds() {
        Scanner in = new Scanner(System.in);
        int hg = in.nextInt();
        if (hg == 0)
            System.exit(0);
        if (hg % 2 == 1) {
            System.out.println(hg);
            Odds();
        }
        else
            Odds();
        //return Odds();
    }
}
