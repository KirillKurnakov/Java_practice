import java.util.HashMap;
public class Main extends StudentChecker{

    public static void main(String[] args) {
        HashMap<String,String> Clients = new HashMap<>();
        Clients.put("123456789456","Курнаков Кирилл Александрович");
        Clients.put("987654321234", "Пяткин Никита Денисович");
        Clients.put("234567891987", "Пупкин Василий Петрович");
        Clients.put("345678921098", "Козлов Дмитрий Иванович");
        Clients.put("456789123839", "Иванов Иван Иванович");
        StudentChecker obj = new StudentChecker();
        obj.Student_check(Clients);
    }
}
