import java.lang.String.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // у меня 11 вариант
    System.out.println("Запуск функции разворот числа, далее потребуется ввести число для разворота");
    Scanner in = new Scanner(System.in);
    int gf2 = in.nextInt();
    Reverse obj2 = new Reverse();
    System.out.println(obj2.Rev(gf2,10,0));

    System.out.println("Запуск функции подсчета количества единиц, далее потребуется ввести числа для выявления единиц, для завершения введите 00");
    NumberOfUnits obj4 = new NumberOfUnits();
    System.out.println(obj4.NOU());

    System.out.println("Запуск функции вывода нечетных чисел, далее потребуется ввести числа для выявления нечетных, для завершения введите 0");
    OddOutput obj3 = new OddOutput();
    obj3.Odds();
    }
}
