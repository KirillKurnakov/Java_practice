import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
public class StudentChecker {

    public void Student_check(HashMap<String,String> Clients) {
        String fio = "";
        InnChecker obj1 = new InnChecker();
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Введите ФИО пользователя");
            try {
                fio = in.nextLine();
                Checking(fio, Clients);
                break;
            } catch (StudentNotFoundException e) {
                fio = "";
                System.out.println(e.getMessage());
            }
        }
            while (true) {
                System.out.println("Введите ИНН пользователя");
                try {
                    String inn = in.nextLine();
                    obj1.Checking_inn(fio,inn,Clients);
                    break;
                }
                catch(InnNotValidException e1) {
                    System.out.println(e1.getMessage());
                }
            }
            System.out.println("Данные верны!");
    }

    public void Checking(String s,HashMap<String,String> Clients) throws StudentNotFoundException{
        Iterator iter = Clients.entrySet().iterator();
        boolean check = false;
        while (iter.hasNext()) {
            Map.Entry pair = (Map.Entry) iter.next();
            if (pair.getValue().equals(s)) {
                check = true;
                break;
            }
        }
        if(check == false) {
            throw new StudentNotFoundException(s);
        }
    }
}
