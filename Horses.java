import javax.naming.Name;
import java.util.Scanner;
import java.util.Vector;

class Horses_1 extends  Thread {
    public static boolean check_end = false;
    public static boolean check_end_1 = false;
    public static int r;
    public static int counter = 1;
    public static int timer = 0;
    Object horse;
    String horse_name;

    Horses_1(Object horse, String horse_name) {
        this.horse = horse;
        this.horse_name = horse_name;
    }

    Horses_1() {
    }

    public static Vector<String> Names_of_finished = new Vector<String>();


    @Override
    public void run() {
        synchronized (horse) {
            while (check_end_1 == false) { // цикл до тех пор, пока все лошади не финишируют
                if (timer - r >= 0) {
                    if (!Names_of_finished.contains(horse_name)) { // проверяем лошадь в списке финишированных
                        System.out.println(horse_name + " финишировала на " + counter + " месте");
                        counter++;
                        Names_of_finished.add(horse_name);
                        if (Names_of_finished.size() == r) { // если все лошади финишировали
                            System.out.println("Скачки завершены!");
                            check_end_1 = true;
                        }
                    }
                }
                timer++;
                try {
                    Thread.sleep(1000); // останавливаем поток на 1с
                } catch (InterruptedException e) {
                }
                horse.notify(); // запускает последний поток, который был остановлен wait

                try {
                    horse.wait(1000); // останавливаем поток на 1с
                } catch (InterruptedException e) {
                }
            }
        }
    }
}

public class Horses {
    public static void main(String[] args) {
        Horses_1 horse = new Horses_1();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество лошадей");
        int n = in.nextInt();
        horse.r = n;
        System.out.println("Скачки начаты!");
        for (int i = 1; i <= n; i++) {
            Horses_1 horses_4 = new Horses_1(horse,"Лошадь_" + Integer.toString(i));
            new Thread(horses_4).start();
        }
    }
}